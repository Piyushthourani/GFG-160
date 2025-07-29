
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/union-of-two-arrays3538

import java.util.*;
public class Day46 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4}; // Example array 1
        int[] arr2 = {3, 4, 5, 6}; // Example array 2
        
        System.out.println("Union of two arrays: ");
        List<Integer> result = union(arr1, arr2);
        System.out.println(result);
    }

    public static List<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
