/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution313Test {
    
    public Solution313Test() {
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
     * Test of nthSuperUglyNumber method, of class Solution313.
     */
    @Test
    public void testNthSuperUglyNumber() {
        System.out.println("nthSuperUglyNumber");
        int n = 0;
        int[] primes = null;
        Solution313 instance = new Solution313();
        int expResult = 0;
        int result = instance.nthSuperUglyNumber(n, primes);
        assertEquals(expResult, result);
        
        assertEquals(32, instance.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}