package edu.westga.cs1302.project2.model;

import java.util.Comparator;

/** Allows Ingredients to be compared based on name
 * 
 * @author CharlesT
 * @version Fall 2024
 */
public class NameComparator implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient i1, Ingredient i2) {
		if (i1.getName().equals(i2.getName())) {
			return 1;
		} else {
			return 0;
		}
	}

}
