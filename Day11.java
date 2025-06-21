// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604


// import java.util.*;
public class Day11 {
    public static void main(String[] args) {
        int[] arr ={-2, 6, -3, -10, 0, 2}; // Example array, you can change it to test with different inputs
        System.out.println("Maximum product subarray: " + maxProduct(arr));
    }


    static int maxProduct(int[] arr) {
        int n=arr.length;
        int prod=Integer.MIN_VALUE;
        int left=1,right=1;
        for(int i=0;i<n;i++)
        {
            if(left==0)
            left=1;
            if(right==0)
            right=1;
            
            left *=arr[i];
            int j=n-i-1;
            right *=arr[j];
            prod=Math.max(left,Math.max(right,prod));
        }
        return prod;
    }
}