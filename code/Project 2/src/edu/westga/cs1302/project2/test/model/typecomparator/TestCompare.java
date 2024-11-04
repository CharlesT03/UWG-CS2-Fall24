package edu.westga.cs1302.project2.test.model.typecomparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.project2.model.Ingredient;
import edu.westga.cs1302.project2.model.TypeComparator;

class TestCompare {
	
	@Test
	void testSameIngredient() {
		TypeComparator testTC = new TypeComparator();
		Ingredient i1 = new Ingredient("Apple", "Fruit");
		Ingredient i2 = new Ingredient("Apple", "Fruit");
		
		assertEquals(testTC.compare(i1, i2), 0);
	}
	
	@Test
	void testFirstTypeSmaller() {
		TypeComparator testTC = new TypeComparator();
		Ingredient i1 = new Ingredient("Apple", "Fruit");
		Ingredient i2 = new Ingredient("Paprika", "Spice");
		
		assertEquals(testTC.compare(i1, i2), -1);
	}
	
	@Test
	void testSecondTypeSmaller() {
		TypeComparator testTC = new TypeComparator();
		Ingredient i1 = new Ingredient("Paprika", "Spice");
		Ingredient i2 = new Ingredient("Apple", "Fruit");
		
		assertEquals(testTC.compare(i1, i2), 1);
	}
	
	@Test
	void testTypeMatch() {
		TypeComparator testTC = new TypeComparator();
		Ingredient i1 = new Ingredient("Cinnamon", "Spice");
		Ingredient i2 = new Ingredient("Paprika", "Spice");
		
		assertEquals(testTC.compare(i1, i2), 0);
	}
	
	@Test
	void testCapitalizationMismatch() {
		TypeComparator testTC = new TypeComparator();
		Ingredient i1 = new Ingredient("Cinnamon", "spice");
		Ingredient i2 = new Ingredient("Paprika", "Spice");
		
		assertEquals(testTC.compare(i1, i2), 1);
	}
}
