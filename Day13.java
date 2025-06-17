
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 4, 1, 1, 7 }; // Example array, you can change it to test with different inputs
        System.out.println("Smallest positive missing number: " + smallestPositiveMissingNumber(arr));
    }

    static int smallestPositiveMissingNumber(int[] arr) {
        int smallest = 1;

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);

        }

        int k = 0;

        while (k < arr.length) {
            if (hs.contains(smallest)) {
                smallest++;
                k++;
            }

            else
                break;

        }

        return smallest;
    }
}
