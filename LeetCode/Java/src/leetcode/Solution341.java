/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import leetcode.common.NestedInteger;

/**
 * Flatten Nested List Iterator.
 * Given a nested list of integers, implement an iterator to flatten it.
 * 
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * 
 * Example 2:
 * Given the list [1,[4,[6]]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 * 
 * @author Johnny
 */
public class Solution341 implements Iterator<Integer> {
    Stack<NestedInteger> stack = new Stack<>();
    public Solution341(List<NestedInteger> nestedList) {
        for(int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()) {
            NestedInteger curr = stack.peek();
            if(curr.isInteger()) {
                return true;
            }
            stack.pop();
            for(int i = curr.getList().size() - 1; i >= 0; i--) {
                stack.push(curr.getList().get(i));
            }
        }
        return false;
    }
}

/*
public class Solution341 implements Iterator<Integer> {
    List<NestedInteger> list;
    Stack<NestedInteger> stack;
    public Solution341(List<NestedInteger> nestedList) {
        list = nestedList;
        stack = new Stack<NestedInteger>();
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
        } 
    }

    @Override
    public Integer next() {
        if (stack.isEmpty()) {
            return null;
        }        

        NestedInteger ni = stack.pop();
        if (ni == null) {
            return null;
        }
        while (!ni.isInteger()) {
            List<NestedInteger> items = ni.getList();
            if (items == null || items.size() == 0) {
                return null;
            }
            for (int i = items.size() - 1; i > 0; i--) {
                stack.push(items.get(i));
            }
            ni = items.get(0);           
        }            
        
        return ni.getInteger();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
*/