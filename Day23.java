
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/inversion-of-array-1587115620

import java.util.*;

public class Day23 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5}; // Example array, you can change it to test with different inputs
        System.out.println("Number of inversions: " + inversionCount(arr));
    }
    static int inversionCount(int arr[]) {
         return mergeSort(arr,0,arr.length-1);
    }
    
    private static int mergeSort(int[] arr,int left,int right){
        int count=0;
        if(left<right){
            int mid=left+(right-left)/2;
            count+=mergeSort(arr,left,mid);
            count+=mergeSort(arr,mid+1,right);
            count+=merge(arr,mid,left,right);
        }
        return count;
    }
    private static int merge(int[] arr,int mid,int left,int right){
        int l=left,r=mid+1;
        int count=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(l<=mid && r<=right){
            if(arr[l]<=arr[r]){
                temp.add(arr[l]);
                l++;
            }else{
                count+=(mid-l+1);
                temp.add(arr[r]);
                r++;
            }
        }
        while(l<=mid){
            temp.add(arr[l]);
            l++;
        }
        while(r<=right){
            temp.add(arr[r]);
            r++;
        }
        for(int i=left;i<=right;i++){
            arr[i]=temp.get(i-left);
        }
        return count;
    }
}
