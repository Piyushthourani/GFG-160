// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/peak-element

import java.util.*;
public class Day31 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element index: " + peakIndex);
    }

    static int findPeak(int[] arr) {
        return binarySearch(arr, 0, arr.length - 1);
    }

    static int binarySearch(int[] arr, int start, int end) {
        if (start == end) {
            return start;
        }
        
        int mid = start + (end - start) / 2;

        if (mid > start && arr[mid] < arr[mid - 1]) {
            return binarySearch(arr, start, mid - 1);
        } else if (mid < end && arr[mid] < arr[mid + 1]) {
            return binarySearch(arr, mid + 1, end);
        } else {
            return mid; // Found a peak
        }
    }
}