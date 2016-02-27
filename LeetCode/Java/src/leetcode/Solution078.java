/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets.
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * 
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 
 * @author Johnny
 */
public class Solution078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums == null) {
            return ret;
        }

        Arrays.sort(nums);// not necessary, just for unit test
        
        List<Integer> list = new ArrayList<Integer>();
        helper(ret, list, nums, 0);
        return ret;
    }
    
    private void helper(List<List<Integer>> ret, List<Integer> list, int[] nums, int pos) {
        ret.add(new ArrayList<Integer>(list));
        
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helper(ret, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }    
}
