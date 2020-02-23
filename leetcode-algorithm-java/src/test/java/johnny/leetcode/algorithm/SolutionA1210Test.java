package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1210Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("daysBetweenDates");
        SolutionA1210 instance = new SolutionA1210();
        assertEquals(true, instance.validateBinaryTreeNodes(4, new int[]{1,-1,3,-1}, new int[]{2,-1,-1,-1}));
        assertEquals(false, instance.validateBinaryTreeNodes(4, new int[]{1,-1,3,-1}, new int[]{2,3,-1,-1}));
        assertEquals(false, instance.validateBinaryTreeNodes(2, new int[]{1,0}, new int[]{-1,-1}));
        assertEquals(false, instance.validateBinaryTreeNodes(6, new int[]{1,-1,-1,4,-1,-1}, new int[]{2,-1,-1,5,-1,-1}));
    }
}
