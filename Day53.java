
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-in-array-whose-sum-is-closest-to-x1124

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day53 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 5};
        int target = 25;
        System.out.println(findClosestPair(arr, target));
    }

    public static List<Integer> findClosestPair(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        int currsum=0;
        List<Integer> ans=new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        int left=0,right=n-1;
        
        while(left<right)
        {
            currsum=arr[left]+arr[right];
            if(Math.abs(target-currsum)<minDiff)
            {
                minDiff=Math.abs(target-currsum);
                ans=Arrays.asList(arr[left],arr[right]);
            }
            if(currsum<target)
            left++;
            else if(currsum>target)
            right--;
            else
            return ans;
        }
        return ans;
    }
}
