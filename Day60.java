
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/container-with-most-water0535

public class Day60 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    
    }
    public static int maxArea(int[] arr) {
        int left=0,right=arr.length-1;
        int ans=0;
        while(left<right)
        {
            int water=Math.min(arr[left],arr[right])*(right-left);
            ans=Math.max(ans,water);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return ans;
    }
}
