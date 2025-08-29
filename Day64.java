
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/product-array-puzzle4525

public class Day64 {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        int result[] = productExceptSelf(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int res[]=new int[n];
        int pro=1;
        int zeros=0,idx=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeros++;
                idx=i;
            }
            else
            {
                pro*=arr[i];
            }
        }
        if(zeros==0)
        {
            for(int i=0;i<n;i++)
            {
                res[i]=pro/arr[i];
            }
        }
        else if(zeros==1)
        {
            res[idx]=pro;
        }
        return res;
    }
}
