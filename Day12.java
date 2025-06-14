// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620

import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12}; // Example array, you can change it to test with different inputs
        System.out.println("Maximum circular subarray sum: " + maxCircularSubarraySum(arr));
    }
    public static int maxCircularSubarraySum(int arr[]) {

        // Your code here
        int totalsum=0;
        int currmaxsum=0,currminsum=0;
        int maxsum=arr[0],minsum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            currmaxsum=Math.max(currmaxsum+arr[i],arr[i]);
            maxsum=Math.max(maxsum,currmaxsum);
            
            currminsum=Math.min(currminsum+arr[i],arr[i]);
            minsum=Math.min(minsum,currminsum);
            
            totalsum +=arr[i];
        }
        int circularsum=totalsum-minsum;
        if(minsum==totalsum)
        return maxsum;
        
        return Math.max(maxsum,circularsum);
    }
}

