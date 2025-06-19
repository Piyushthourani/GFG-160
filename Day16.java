
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/anagram-1587115620

import java.util.*;
public class Day16 {
    public static void main(String[] args) {
        String str1 = "listen"; // Example string, you can change it to test with different inputs
        String str2 = "silent"; // Example string, you can change it to test with different inputs
        System.out.println("Are the strings anagrams? " + areAnagrams(str1, str2));
    }

    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2); // Check if sorted arrays are equal
    }
}