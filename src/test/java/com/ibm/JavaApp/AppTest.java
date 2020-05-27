package com.ibm.JavaApp;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {
   
	App tet = new App(2,3);
	@Test
    public void twoAndThreeIsFive() throws Exception {
    	assertEquals(tet.addFunction(2, 3),5);
    }

	@Test
    public void threeMinusTwoIsOne() throws Exception {
        assertEquals(tet.subFunction(2, 3),1);
    }
    
	@Test
    public void threeXThreeIsNine() throws Exception {
        assertEquals(tet.mulFunction(3, 3), 9);
    }
    
}
