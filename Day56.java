
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/subarray-with-given-sum-1587115621

import java.util.ArrayList;

public class Day56 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;
        ArrayList<Integer> result = findSubarrayWithGivenSum(arr, targetSum);
        if (result.size() == 2) {
            System.out.println("Subarray found between indices " + result.get(0) + " and " + result.get(1));
        } else {
            System.out.println("No subarray found");
        }
    }

    public static ArrayList<Integer> findSubarrayWithGivenSum(int[] arr, int target) {
        int s=0,e=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>=target)
            {
                e=i;
                while(sum>target && s<e)
                {
                    sum-=arr[s];
                    s++;
                }
                if(sum==target)
                {
                    ans.add(s+1);
                    ans.add(e+1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}
