package edu.westga.cs1302.project2.test.model.namecomparator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.westga.cs1302.project2.model.NameComparator;

class TestToString {
	
	@Test
	void test() {
		NameComparator testNC = new NameComparator();
		
		String result = testNC.toString();
		
		assertEquals(result, "Name");
	}
	
}
