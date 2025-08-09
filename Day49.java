
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/subarrays-with-sum-k

import java.util.HashMap;

public class Day49 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5}; // Example array, you can change it to test with different inputs
        int k = 5; // Example sum, you can change it to test with different inputs
        
        System.out.println("Number of subarrays with sum " + k + ": " + subarraySum(arr, k));
    }
    static int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> prefixsum=new HashMap<>();
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            ans++;
            
            if(prefixsum.containsKey(sum-k))
            ans+=prefixsum.get(sum-k);
            
            prefixsum.put(sum,prefixsum.getOrDefault(sum,0)+1);
            
        }
        return ans;
    }
}
