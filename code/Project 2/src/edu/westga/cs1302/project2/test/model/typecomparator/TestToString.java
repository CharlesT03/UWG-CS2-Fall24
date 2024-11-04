package edu.westga.cs1302.project2.test.model.typecomparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.project2.model.TypeComparator;

class TestToString {
	
	@Test
	void test() {
		TypeComparator testTC = new TypeComparator();
		
		String result = testTC.toString();
		
		assertEquals(result, "Type");
	}
	
}
