// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/kth-missing-positive-number-in-a-sorted-array

public class Day35 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5; // The k-th missing positive number
        int result = findKthMissing(arr, k);
        System.out.println("The " + k + "-th missing positive number is: " + result);
    }

    public static int findKthMissing(int[] arr, int k) {
        int start=0,end=arr.length-1;
        int ans=arr.length+k;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>mid+k)
            {
                ans=mid+k;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
