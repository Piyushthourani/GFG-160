
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-possible-triangles-1587115620

import java.util.Arrays;

public class Day55 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println(countTriangles(arr));
    }

    static int countTriangles(int[] arr) {
         int ans=0;
        Arrays.sort(arr);
        for(int i=2;i<arr.length;i++)
        {
            int left=0,right=i-1;
            while(left<right)
            {
                if(arr[left]+arr[right]>arr[i])
                {
                    ans+=right-left;
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return ans;
    }
    
}
