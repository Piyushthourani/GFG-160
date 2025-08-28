
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/largest-subarray-of-0s-and-1s

import java.util.HashMap;

public class Day63 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 1};
        System.out.println("Length of the largest subarray is: " + findLargestSubarray(arr));
    }

    public static int findLargestSubarray(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int prefsum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefsum+=(arr[i]==0)?-1:1;
            if(prefsum==0)
            ans=i+1;
            
            if(mp.containsKey(prefsum))
            {
                ans=Math.max(ans,i-mp.get(prefsum));
            }
            else
            {
                mp.put(prefsum,i);
            }
        }
        return ans;
    }
}