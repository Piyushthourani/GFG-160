
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/find-all-triplets-with-zero-sum

import java.util.*;

public class Day44 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> triplets = findTriplets(arr);
        System.out.println(triplets);
    }

    public static List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n=arr.length;
        HashMap<Integer, List<Integer>> mp=new HashMap<>();
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int val= -1 *(arr[i]+arr[j]);
                if(mp.containsKey(val))
                {
                    for(int k:mp.get(val))
                    {
                        li.add(Arrays.asList(k,i,j));
                    }
                }
            }
            mp.putIfAbsent(arr[i], new ArrayList<>());
            mp.get(arr[i]).add(i);
        }
        return li;
    }
}