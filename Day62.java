
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/longest-sub-array-with-sum-k0809

import java.util.HashMap;

public class Day62 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;
        System.out.println("Length of longest subarray: " + longestSubarrayWithSumK(arr, k));
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int prefsum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefsum+=arr[i];
            if(prefsum==k)
            {
                ans=i+1;
            }
            else if(mp.containsKey(prefsum-k))
            {
                ans=Math.max(ans,i-mp.get(prefsum-k));
            }
            if(!mp.containsKey(prefsum))
            mp.put(prefsum,i);
        }
        return ans;
    }
}
