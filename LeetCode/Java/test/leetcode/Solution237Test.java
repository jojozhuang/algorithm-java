/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
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
public class Solution237Test {
    
    public Solution237Test() {
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
     * Test of deleteNode method, of class Solution237.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        ListNode node = null;
        Solution237 instance = new Solution237();
        instance.deleteNode(node);
        
        ListNode node2 = new ListNode(1);
        instance.deleteNode(node2);
        //assertEquals(null, node2);

        ListNode head3 = ListNode.createInstance(new int[]{3,1});
        ListNode expect3 = ListNode.createInstance(new int[]{1});
        instance.deleteNode(head3);
        assertTrue(ListNode.isSame(expect3, head3));
        
        ListNode head4 = ListNode.createInstance(new int[]{3,1,2});
        ListNode expect4 = ListNode.createInstance(new int[]{3,2});
        instance.deleteNode(head4.next);
        assertTrue(ListNode.isSame(expect4, head4));
        
        // delete node except the tail
        //ListNode head5 = ListNode.createInstance(new int[]{6,3,8});
        //ListNode expect5 = ListNode.createInstance(new int[]{6,3});
        //instance.deleteNode(head5.next.next);
        //assertTrue(ListNode.isSame(expect5, head5));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
