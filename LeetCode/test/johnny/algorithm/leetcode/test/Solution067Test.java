/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution067;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution067Test {
    
    public Solution067Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addBinary method, of class Solution067.
     */
    @Test
    public void testAddBinary() {
        System.out.println("addBinary");
        String a = "";
        String b = "";
        Solution067 instance = new Solution067();
        String expResult = "";
        String result = instance.addBinary(a, b);
        assertEquals(expResult, result);
        
        assertEquals("1", instance.addBinary("", "1"));
        assertEquals("1", instance.addBinary("1", "0"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("100", instance.addBinary("1", "11"));
        assertEquals("110", instance.addBinary("11", "11"));
        assertEquals("101", instance.addBinary("1", "100"));
        assertEquals("10000", instance.addBinary("1111", "1"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}