// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/search-in-a-rotated-array4618

import java.util.*;
public class Day30 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        System.out.println("Index of " + target + ": " + result);
    }

    static int search(int[] arr, int key) {
        // Complete this function
         return binary(arr,key,0,arr.length-1);
    }
    public static int binary(int[] arr,int target,int start,int end)
    {
        if(start>end)
        return -1;

        int mid=start +(end-start)/2;
        if(arr[mid]==target)
        return mid;

        if(arr[start]<=arr[mid])
        {
            if(target>=arr[start] && target<=arr[mid])
            return binary(arr,target,start,mid-1);
            else
            return binary(arr,target,mid+1,end);
        }
        if(target>=arr[mid] && target<=arr[end])
        return binary(arr,target,mid+1,end);
        else
        return binary(arr,target,start,mid-1);
    }
}