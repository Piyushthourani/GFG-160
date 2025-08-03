
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/longest-consecutive-subsequence2449

import java.util.*;
public class Day47 {
    public static int findLongestConseqSubseq(int arr[], int n) {
        Set<Integer> hs=new HashSet<>();
        int ans=0;
        for (int num:arr)
        {
            hs.add(num);
        }
        for(int val:arr)
        {
            if(hs.contains(val)  && !hs.contains(val-1))
            {
                int curr=val,count=0;
                while(hs.contains(curr))
                {
                    hs.remove(curr);
                    count++;
                    curr++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3}; // Example array, you can change it to test with different inputs
        int n = arr.length;
        System.out.println("Length of the longest consecutive subsequence: " + findLongestConseqSubseq(arr, n));
    }
}
