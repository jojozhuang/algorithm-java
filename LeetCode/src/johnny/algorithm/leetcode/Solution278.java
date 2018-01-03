/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;
import java.util.HashMap;
import johnny.algorithm.leetcode.common.VersionControl;
/**
 * First Bad Version.
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, all the 
 * versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which will return whether 
 * version is bad. Implement a function to find the first bad version. You 
 * should minimize the number of calls to the API.
 * 
 * @author Johnny
 */
public class Solution278 extends VersionControl{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        boolean testResult = false; // true: bad version; false: good version.
        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            testResult = super.isBadVersion(mid);
            if (testResult == true) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (super.isBadVersion(start)) {
            return start;
        }
        
        return end;
    }
}