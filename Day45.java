// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/intersection-of-two-arrays-with-duplicate-elements

import java.util.*;

public class Day45 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 1}; // Example array 1
        int[] arr2 = {3, 1, 3, 4, 1}; // Example array 2
        
        System.out.println("Intersection of two arrays: ");
        List<Integer> result = intersection(arr1, arr2);
        System.out.println(result);
    }

    static List<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:a)
        {
            hs.add(num);
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int num:b)
        {
            if(hs.contains(num))
            {
                li.add(num);
                hs.remove(num);
            }
        }
        return li;
    }
}