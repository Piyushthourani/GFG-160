// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/k-th-element-of-two-sorted-array1317

public class Day32 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5; // Example k value
        
        System.out.println("K-th element: " + kthElement(arr1, arr2, k));
    }
    public static int kthElement(int[] a, int[] b, int k) {
        int n=a.length;
        int m=b.length;
        
        if(n>m)
        {
            return kthElement(b,a,k);
        }
        int start=Math.max(0,k-m);
        int end=Math.min(k,n);
        
        while(start<=end)
        {
            int mid1=(start+end)/2;
            int mid2=k-mid1;
            
            int l1=(mid1==0)?Integer.MIN_VALUE:a[mid1-1];
            int l2=(mid2==0)?Integer.MIN_VALUE:b[mid2-1];
            
            int r1=(mid1==n)?Integer.MAX_VALUE:a[mid1];
            int r2=(mid2==m)?Integer.MAX_VALUE:b[mid2];
            
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                end=mid1-1;
            }
            else
            {
                start=mid1+1;
            }
        }
        return -1;
    }
}
