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
public class BackpackTest {
    
    public BackpackTest() {
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
     * Test of backPack method, of class Backpack.
     */
    @Test
    public void testBackPack() {
        System.out.println("backPack");
        int m = 0;
        int[] A = null;
        Backpack instance = new Backpack();
        int expResult = 0;
        int result = instance.backPack(m, A);
        assertEquals(expResult, result);
        
        assertEquals(10, instance.backPack(11, new int[]{2,3,5,7}));
    }
    
}
