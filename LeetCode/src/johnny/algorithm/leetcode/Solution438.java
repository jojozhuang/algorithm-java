package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Anagrams in a String
 * 
 * Given a string s and a non-empty string p, find all the start indices of p's 
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both 
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1:
 * 
 * Input:
 * s: "cbaebabacd" p: "abc"
 *
 * Output:
 * [0, 6]
 * 
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 * Example 2:
 * 
 * Input:
 * s: "abab" p: "ab"
 * 
 * Output:
 * [0, 1, 2]
 * 
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * 
 * @author Johnny
 */
public class Solution438 {
 // slide window + hashtable
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        
        int fast = 0;
        int slow = 0;
        int[] window = new int[26];
        while (fast < s.length()) {
            window[s.charAt(fast) - 'a']++;
            if (fast - slow > p.length() - 1) {
                window[s.charAt(slow) - 'a']--;
                slow++;
            }
            if (fast - slow + 1 == p.length() &&
                isSame(count, window)) {
                ans.add(slow);
            }
            fast++;
        }
        
        return ans;
    }
    
    private boolean isSame(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || s.isEmpty() || p.length() > s.length()) {
            return res;
        }
        
        int[] counts = new int[26];
        for (int i = 0; i < p.length(); i++) {
            counts[p.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] countsCopy = counts.clone();
            for (int j = 0; j < p.length(); j++) {
                countsCopy[s.charAt(j + i) - 'a']--;
            }
            
            boolean isAnagrams = true;
            for (int k = 0; k < countsCopy.length; k++) {
                if (countsCopy[k] != 0) {
                    isAnagrams = false;
                    break;
                }
            }
            
            if (isAnagrams) {
                res.add(i);
            }
        }
        
        return res;
    }
}
