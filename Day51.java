
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-all-triplets-with-given-sum-in-sorted-array

public class Day51 {
    public static void main(String[] args) {
        int[] arr = {-3, -1, -1, 0, 1, 2};
        int sum = -2;
        System.out.println(countTriplets(arr, sum));
    }

    static int countTriplets(int[] arr, int target) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<target)
                {
                    left++;
                }
                else if(sum>target)
                {
                    right--;
                }
                else if(sum==target)
                {
                    int ele1=arr[left];
                    int ele2=arr[right];
                    int c1=0,c2=0;
                    while(left<=right && arr[left]==ele1)
                    {
                        left++;
                        c1++;
                    }
                    while(left<=right && arr[right]==ele2)
                    {
                        right--;
                        c2++;
                    }
                    if(ele1==ele2)
                    ans+=(c1*(c1-1))/2;
                    else
                    ans+=c1*c2;
                }
            }
        }
        return ans;
    }
}
