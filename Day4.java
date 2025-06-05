
//Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621

public class Day4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array, you can change it to test with different inputs
        int n = 2; // Number of positions to rotate
        System.out.println("Array before rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotateArray(arr, n);

        System.out.println("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotateArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // Handle cases where n is greater than the array length
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, n, length - 1);
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
