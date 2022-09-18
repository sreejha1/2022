package src.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/merge-intervals/

Given an array of intervals where intervals[i] = [starti, endi], 
merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
https://leetcode.com/problems/merge-intervals/discuss/21222/A-simple-Java-solution

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

 The idea is to sort the intervals by their starting points. Then, we take the first interval and compare its end with the next intervals starts. As long as they overlap, we update the end to be the max end of the overlapping intervals. Once we find a non overlapping interval, we can add the previous "extended" interval and start over.

    Sorting takes O(n log(n)) and merging the intervals takes O(n). So, the resulting algorithm takes O(n log(n)).

 */
public class MergeIntervals {
    public static void main(String args[]) {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        int[][] result = new Solution().merge(input);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


    static class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1)
                return intervals;

            // Sort by ascending starting point
            Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

            List<int[]> result = new ArrayList<>();
            int[] newInterval = intervals[0];
            result.add(newInterval);
            for (int[] interval : intervals) {
                if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                else {                             // Disjoint intervals, add the new interval to the list
                    newInterval = interval;
                    result.add(newInterval);
                }
            }
            return result.toArray(new int[result.size()][]);
        }
    }
}
