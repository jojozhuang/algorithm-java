package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

import johnny.algorithm.leetcode.common.Interval;

/**
 * Non-overlapping Intervals
 * 
 * Given a collection of intervals, find the minimum number of intervals you 
 * need to remove to make the rest of the intervals non-overlapping.
 * 
 * Note:
 * You may assume the interval's end point is always bigger than its start point.
 * 
 * Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
 * 
 * Example 1:
 * Input: [ [1,2], [2,3], [3,4], [1,3] ]
 * Output: 1
 * Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
 * 
 * Example 2:
 * Input: [ [1,2], [1,2], [1,2] ]
 * Output: 2
 * Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
 * 
 * Example 3:
 * Input: [ [1,2], [2,3] ]
 * Output: 0
 * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 * 
 * @author Johnny
 */
public class Solution435 {
    //https://leetcode.com/problems/non-overlapping-intervals/discuss/91713/Java%3A-Least-is-Most
    // the problem is the same as "Given a collection of intervals, find the maximum number of intervals that are non-overlapping."
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a,b)->(a.end - b.end));
        
        int count = 1;
        int end = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        
        return intervals.length - count;
    }
}
