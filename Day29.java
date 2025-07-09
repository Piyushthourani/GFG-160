// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/minimum-element-in-a-sorted-and-rotated-array3611

public class Day29 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int result = findMin(arr);
        System.out.println("Minimum element in the sorted and rotated array: " + result);
    }

    static int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1; // Minimum is in the right half
            } else {
                end = mid; // Minimum is in the left half or at mid
            }
        }
        return arr[start]; // The minimum element
    }
}
