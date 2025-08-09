
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-subarray-with-given-xor

import java.util.HashMap;

public class Day50 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4}; // Example array, you can change it to test with different inputs
        int k = 6; // Example XOR, you can change it to test with different inputs

        System.out.println("Number of subarrays with XOR " + k + ": " + subarrayXOR(arr, k));
    }

    static int subarrayXOR(int[] arr, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int sum=0;
        for(int val:arr)
        {
            sum=sum^val;
            ans=ans+mp.getOrDefault(sum^k,0);
            if(sum==k)
            {
                ans++;
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
