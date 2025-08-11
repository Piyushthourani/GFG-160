
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-pairs-whose-sum-is-less-than-target

import java.util.Arrays;

public class Day52 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,3};
        int target = 8;
        System.out.println(countPairs(arr, target));
    }

    public static int countPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        int c=0;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum<target)
            {
                c+=right-left;
                left++;
            }
            else
            {
                right--;
            }
        }
        return c;
    }
}
