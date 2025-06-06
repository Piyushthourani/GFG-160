
// Problem Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

import java.util.*;
public class Day6 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6}; // Example array, you can change it to test with different inputs
        
        System.out.println("Majority elements: " + majorityElement(arr));
    }

    static List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:nums)
        {
            if(mp.containsKey(n))
            mp.put(n,mp.get(n)+1);
            else
            mp.put(n,1);
        }
        int t=nums.length/3;
        for(Map.Entry<Integer,Integer> set:mp.entrySet())
        {
            if(set.getValue()>t)
            li.add(set.getKey());
        }
        return li;
    }
}
