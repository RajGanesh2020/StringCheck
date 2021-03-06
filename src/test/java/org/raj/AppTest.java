/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.raj;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	
	/**
	 * Test String which has duplicate character
	 * Expected result is true 
	 */
    @Test 
    public void testAppHasDuplicateString_positive() {
        App classUnderTest = new App();
        assertTrue("Has Duplicate Chars", classUnderTest.hasDuplicateChars("java"));
    }
    
	/**
	 * Test String which doesn't has duplicate character
	 * Expected result is false 
	 */

    @Test 
    public void testAppHasDuplicateString_negative() {
        App classUnderTest = new App();
        assertFalse("Does not Have Duplicate Chars", classUnderTest.hasDuplicateChars(".net"));
    }
    
	/**
	 * Test String which has duplicate character with upper and lower case combination
	 * Expected result is true 
	 */

    @Test 
    public void testAppHasDuplicateString_edge_1() {
        App classUnderTest = new App();
        assertTrue("Has Duplicate Chars", classUnderTest.hasDuplicateChars("jAva"));
    }
    
	/**
	 * Test String which has duplicate character with spaces in between
	 * Expected result is false 
	 */

    @Test 
    public void testAppHasDuplicateString_edge_2() {
        App classUnderTest = new App();
        assertFalse("Does not Have Duplicate Chars", classUnderTest.hasDuplicateChars(". ne t "));
    }
}
