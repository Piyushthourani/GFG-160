// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604


// import java.util.*;
public class Day11 {
    public static void main(String[] args) {
        int[] arr ={-2, 6, -3, -10, 0, 2}; // Example array, you can change it to test with different inputs
        System.out.println("Maximum product subarray: " + maxProduct(arr));
    }

/*************  ✨ Windsurf Command ⭐  *************/
    /**
     * This function returns the maximum product of a subarray in the given array.
     * The idea is to keep track of the maximum and minimum product ending at each position.
     * The maximum product of a subarray ending at the current position is
     * the maximum of the current element, the maximum product of the subarray ending at the previous position
     * multiplied by the current element, and the minimum product of the subarray ending at the previous position
     * multiplied by the current element. The minimum product of a subarray ending at the current position is
     * the minimum of the current element, the minimum product of the subarray ending at the previous position
     * multiplied by the current element, and the maximum product of the subarray ending at the previous position
     * multiplied by the current element.
     * @param arr the given array
     * @return the maximum product of a subarray in the given array
     */
/*******  c78149d7-d8f6-46da-977a-217ae97043d3  *******/
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