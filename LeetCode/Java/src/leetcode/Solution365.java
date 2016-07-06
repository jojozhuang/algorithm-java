/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Water and Jug Problem.
 * 
 * You are given two jugs with capacities x and y litres. There is an infinite 
 * amount of water supply available. You need to determine whether it is 
 * possible to measure exactly z litres using these two jugs.
 * 
 * If z liters of water is measurable, you must have z liters of water contained
 * within one or both buckets by the end.
 * 
 * Operations allowed:
 * 
 * Fill any of the jugs completely with water.
 * Empty any of the jugs.
 * Pour water from one jug into another till the other jug is completely full 
 * or the first jug itself is empty.
 * Example 1: (From the famous "Die Hard" example)
 * 
 * Input: x = 3, y = 5, z = 4
 * Output: True
 * Example 2:
 * 
 * Input: x = 2, y = 6, z = 5
 * Output: False
 * 
 * @author Johnny
 */
public class Solution365 {
    //http://www.cnblogs.com/grandyang/p/5628836.html
    public boolean canMeasureWater(int x, int y, int z) {
        return z == 0 || (x + y >= z && z % gcd(x, y) == 0);
    }
    
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
