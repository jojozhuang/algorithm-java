/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Super Ugly Number.
 * Write a program to find the nth super ugly number.
 * 
 * Super ugly numbers are positive numbers whose all prime factors are in the 
 * given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32]
 * is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.
 * 
 * Note:
 * (1) 1 is a super ugly number for any given primes.
 * (2) The given numbers in primes are in ascending order.
 * (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 *
 * @author Johnny
 */
public class Solution313 {
    // Similar logic with Ugly Number 2
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0) {
            return 0;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        int[] index = new int[primes.length];
        int count = 1;
        
        while(count < n) {
            arr[count] = nextUgly(arr, primes, index);
            for (int i = 0; i < index.length; i++) {
                if (arr[count] == arr[index[i]] * primes[i]) {
                    index[i] = index[i] + 1;
                }
            }
            count++;
        }
        
        return arr[n - 1];
    }
    
    private int nextUgly(int[] ugly, int[] primes, int[] index) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < index.length; i++) {
            min = Math.min(ugly[index[i]] * primes[i], min);
        }
        return min;
    }
}