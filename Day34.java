// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/allocate-minimum-number-of-pages0937

public class Day34 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = 2;
        System.out.println(minPages(arr, n));
    }
    public static int minPages(int[] arr, int k) {
         int n=arr.length;
        if(k>n)return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        int ans=-1;
        for(int i:arr){
            high+=i;
            low=Math.max(i,low);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,k)){
                high=mid-1;
                ans=mid;
            }
            else low=mid+1;
        }
        return ans;
    }
    static boolean possible(int[] arr,int pages,int k){
        int students=1;
        int pagesStudent=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+pagesStudent<=pages){
                pagesStudent+=arr[i];
            }
            else{
                students++;
                pagesStudent=arr[i];
                if(students>k)return false;
            }
        }
        return true;
    }
}
