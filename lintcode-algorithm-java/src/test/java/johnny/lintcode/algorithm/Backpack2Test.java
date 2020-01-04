package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class Backpack2Test {
    
    public Backpack2Test() {
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
     * Test of backPack2 method, of class Backpack2.
     */
    @Test
    public void testBackPack2() {
        System.out.println("backPack2");
        int m = 0;
        int[] A = null;
        int[] V = null;
        Backpack2 instance = new Backpack2();
        int expResult = 0;
        int result = instance.backPack2(m, A, V);
        assertEquals(expResult, result);
        
        assertEquals(9, instance.backPack2(10, new int[]{2,3,5,7}, new int[]{1,5,2,4}));
    }
}
