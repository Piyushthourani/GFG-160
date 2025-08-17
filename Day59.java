
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/trapping-rain-water-1587115621

public class Day59 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] arr) {
        int left=1,right=arr.length-2;
        int lmax=arr[left-1];
        int ans=0;
        int rmax=arr[right+1];
        while(left<=right)
        {
            if(rmax<=lmax)
            {
                ans+=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right--;
            }
            else
            {
                ans+=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left++;
            }
        }
        return ans;
    }
}
