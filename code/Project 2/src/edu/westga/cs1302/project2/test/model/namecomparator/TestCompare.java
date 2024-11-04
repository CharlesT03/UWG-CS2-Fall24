package edu.westga.cs1302.project2.test.model.namecomparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.project2.model.Ingredient;
import edu.westga.cs1302.project2.model.NameComparator;

class TestCompare {
	
	@Test
	void testNameMatch() {
		NameComparator testNC = new NameComparator();
		Ingredient i1 = new Ingredient("Cinnamon", "Spice");
		Ingredient i2 = new Ingredient("Cinnamon", "Spice");
		
		assertEquals(testNC.compare(i1, i2), 1);
	}
	
	@Test
	void testNameDoesNotMatch() {
		NameComparator testNC = new NameComparator();
		Ingredient i1 = new Ingredient("Apple", "Fruit");
		Ingredient i2 = new Ingredient("Paprika", "Spice");
		
		assertEquals(testNC.compare(i1, i2), 0);
	}
	
	@Test
	void testHomonymIngredientsTypeMismatch() {
		NameComparator testNC = new NameComparator();
		Ingredient i1 = new Ingredient("Pepper", "Spice");
		Ingredient i2 = new Ingredient("Pepper", "Vegetable");
		
		assertEquals(testNC.compare(i1, i2), 1);
	}
	
	@Test
	void testCapitalizationMismatch() {
		NameComparator testNC = new NameComparator();
		Ingredient i1 = new Ingredient("Cinnamon", "Spice");
		Ingredient i2 = new Ingredient("cinnamon", "Spice");
		
		assertEquals(testNC.compare(i1, i2), 0);
	}
}
