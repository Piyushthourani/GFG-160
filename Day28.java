// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/number-of-occurrence2259

import java.util.*;
public class Day28 {

     public static int countFreq(int[] arr, int target) {
        // code here
        return upperbound(arr,target)-lowerbound(arr,target);
    }
    static int lowerbound(int arr[],int t){
        int start=0,end=arr.length-1;
        int ans=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>=t)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return ans;
    }
    static int upperbound(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        int ans=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,3};
        int x = 2;
        int result = countFreq(arr, x);
        System.out.println("Number of occurrences of " + x + ": " + result);
    }
}