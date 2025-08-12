
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-with-given-sum-in-a-sorted-array4940

public class Day54 {

    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        int result = findPairWithSum(arr, target);
        System.out.println("Number of pairs with sum " + target + ": " + result);
    }

    public static int findPairWithSum(int[] arr, int target) {
        int n=arr.length;
        int ans=0;
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]+arr[right]<target)
            {
                left++;
            }
            else if(arr[left]+arr[right]>target)
            {
                right--;
            }
            else
            {
                int c1=0,c2=0;
                int ele1=arr[left],ele2=arr[right];
                while(left<=right && arr[left]==ele1)
                {
                    c1++;
                    left++;
                }
                while(left<=right && arr[right]==ele2)
                {
                    c2++;
                    right--;
                }
                if(ele1==ele2)
                ans+=(c1*(c1-1))/2;
                else
                ans+=(c1*c2);
            }
        }
        return ans;
    }
}