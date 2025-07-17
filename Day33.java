// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/aggressive-cows

import java.util.Arrays;
public class Day33 {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3; // Number of cows to place
        int result = aggressiveCows(stalls, cows);
        System.out.println("Maximum minimum distance: " + result);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int ans=0;
        int start=1;
        int end=stalls[stalls.length-1]-stalls[0];
        while(start<=end)
        {
           int mid=start+(end-start)/2;
           if(check(stalls,k,mid))
           {
               ans=mid;
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
        }
        return ans;
    }
    public static boolean check(int stalls[],int k, int d)
    {
        int count=1;
        int prev=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-prev>=d)
            {
                prev=stalls[i];
                count++;
            }
        }
        return (count>=k);
    }
}
