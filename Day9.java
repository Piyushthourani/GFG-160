// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351

import java.util.Arrays;

public class Day9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10}; // Example array, you can change it to test with different inputs
        int k = 2; // Example value for k
        System.out.println("Minimum difference after adjusting heights: " + getMinDiff(arr, k));
    }

    static int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            continue;
            int min=Math.min(arr[0]+k,arr[i]-k);
            int max=Math.max(arr[i-1]+k,arr[n-1]-k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}