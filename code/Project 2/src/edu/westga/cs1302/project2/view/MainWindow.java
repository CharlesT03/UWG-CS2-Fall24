package edu.westga.cs1302.project2.view;

import edu.westga.cs1302.project2.model.Ingredient;
import edu.westga.cs1302.project2.model.TypeComparator;
import edu.westga.cs1302.project2.model.NameComparator;
import java.util.Comparator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Codebehind for the Main Window of the application.
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class MainWindow {
	@FXML private ComboBox<String> ingredientType;
	@FXML private ListView<Ingredient> ingredientsList;
	@FXML private TextField ingredientName;
	@FXML private ComboBox<Comparator<Ingredient>> sortType;

	@FXML
	void addIngredient(ActionEvent event) {
		try {
			this.ingredientsList.getItems().add(new Ingredient(this.ingredientName.getText(), this.ingredientType.getValue()));
			this.ingredientName.clear();
			this.ingredientType.getSelectionModel().clearSelection();
			if (this.sortType.getSelectionModel().getSelectedItem() != null) {
				this.ingredientsList.getItems().sort(this.sortType.getSelectionModel().getSelectedItem());
			}
		} catch (IllegalArgumentException error) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Unable to add ingredient");
			alert.setContentText(error.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void removeIngredient(ActionEvent event) {
		Ingredient selectedIngredient = this.ingredientsList.getSelectionModel().getSelectedItem();
		if (selectedIngredient != null) {
			this.ingredientsList.getItems().remove(selectedIngredient);
			if (this.sortType.getSelectionModel().getSelectedItem() != null) {
				this.ingredientsList.getItems().sort(this.sortType.getSelectionModel().getSelectedItem());
			}
		}
	}
	
	@FXML
	void sortIngredientsByCriteria(ActionEvent event) {
		this.ingredientsList.getItems().sort(this.sortType.getSelectionModel().getSelectedItem());
	}
	
	@FXML
	void initialize() {
		this.ingredientType.getItems().add("Vegetable");
		this.ingredientType.getItems().add("Meat");
		this.ingredientType.getItems().add("Bread");
		this.ingredientType.getItems().add("Fruit");
		this.ingredientType.getItems().add("Spice");
		
		TypeComparator tc = new TypeComparator();
		NameComparator nc = new NameComparator();
		this.sortType.getItems().add(tc);
		this.sortType.getItems().add(nc);

	}
	
}
