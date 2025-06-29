
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/overlapping-intervals--170633

import java.util.*;
public class Day24 {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,4},{6,8},{9,10}};
        List<int[]> result = mergeIntervals(arr);
        System.out.print("Merged Intervals: [");
        for (int i = 0; i < result.size(); i++) {
            int[] interval = result.get(i);
            System.out.print("[" + interval[0] + "," + interval[1] + "]");
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static List<int[]> mergeIntervals(int[][] arr) {
        List<int[]> res = new ArrayList<>();
        
        // Sort intervals by the starting point
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Initialize the first interval
        int[] currentInterval = arr[0];
        res.add(currentInterval);
        
        // Iterate through the intervals
        for (int i = 1; i < arr.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = arr[i][0];
            int nextEnd = arr[i][1];
            
            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval
                currentInterval = arr[i];
                res.add(currentInterval);
            }
        }
        
        return res;
    }
}