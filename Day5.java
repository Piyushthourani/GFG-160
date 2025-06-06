// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

import java.util.*;

public class Day5 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0}; // Example array, you can change it to test with different inputs
        
        System.out.println("Array before next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        nextPermutation(arr);
        
        System.out.println("Array after next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void nextPermutation(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        int n=arr.size();
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i)<arr.get(i+1)){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Collections.reverse(arr);
            //return arr;
        }
        else{
            for(int i=n-1;i>idx;i--){
            if(arr.get(i)>arr.get(idx)){
                int temp=arr.get(i);
                arr.set(i,arr.get(idx));
                arr.set(idx,temp);
                break;
            }
        }
        List<Integer> sublist=arr.subList(idx+1,n);
        Collections.reverse(sublist);
        } 
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
    }
}
    
