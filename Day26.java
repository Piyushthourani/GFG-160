// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/non-overlapping-intervals

import java.util.*;
public class Day26 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int nonOverlappingCount = eraseOverlapIntervals(intervals);
        System.out.println("Minimum number of intervals to remove: " + nonOverlappingCount);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int last = 0;
        int ans = 0;
         int N = intervals.length;
        for(int i =1;i<N;i++){
            if(intervals[i][0]<intervals[last][1])
             ans++;
              else
              last = i;
            }
        return ans;
    }
}