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
public class Solution179Test {
    
    public Solution179Test() {
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
     * Test of largestNumber method, of class Solution179.
     */
    @Test
    public void testLargestNumber() {
        System.out.println("largestNumber");
        int[] nums = null;
        Solution179 instance = new Solution179();
        String expResult = "";
        String result = instance.largestNumber(nums);
        assertEquals(expResult, result);
        
        assertEquals("0", instance.largestNumber(new int[]{0,0}));
        assertEquals("9534330", instance.largestNumber(new int[]{3,30,34,5,9}));
        assertEquals("5645342312", instance.largestNumber(new int[]{12,23,34,45,56}));
        assertEquals("22060", instance.largestNumber(new int[]{2, 2060}));
        assertEquals("2281222162060", instance.largestNumber(new int[]{2, 2060, 2216,2281}));
        assertEquals("2281222162132060", instance.largestNumber(new int[]{2, 2060, 2216, 213, 2281}));
        assertEquals("98909827968595339456944893859149094902689398937839883538183810810780707982784676057536747174237321720571007032685668066758674466986636554651163276306626562416221603859725909578457125682552954605422520849804812479847044453428339323905384638363699366436503636357535673516346233993298316330843021297028227452732697246523622362231322812216213206020001921763154815181495141713801147114310901048", instance.largestNumber(new int[]{4704,6306,9385,7536,3462,4798,5422,5529,8070,6241,9094,7846,663,6221,216,6758,8353,3650,3836,8183,3516,5909,6744,1548,5712,2281,3664,7100,6698,7321,4980,8937,3163,5784,3298,9890,1090,7605,1380,1147,1495,3699,9448,5208,9456,3846,3567,6856,2000,3575,7205,2697,5972,7471,1763,1143,1417,6038,2313,6554,9026,8107,9827,7982,9685,3905,8939,1048,282,7423,6327,2970,4453,5460,3399,9533,914,3932,192,3084,6806,273,4283,2060,5682,2,2362,4812,7032,810,2465,6511,213,2362,3021,2745,3636,6265,1518,8398}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
