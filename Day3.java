// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

public class Day3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array, you can change it to test with different inputs
        
        System.out.println("Array before reversal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        reverseArray(arr);
        
        System.out.println("Array after reversal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverseArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
}