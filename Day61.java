
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/equilibrium-point-1587115620

public class Day61 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2}; // Example array, you can change it to test with different inputs
        int equilibriumIndex = findEquilibrium(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index is: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }

    static int findEquilibrium(int[] arr) {
       int prefsum=0,total=0;
        for(int num:arr)
        {
            total+=num;
        }
        for(int i=0;i<arr.length;i++)
        {
            int suffsum=total-prefsum-arr[i];
            if(prefsum==suffsum)
            return i;
            
            prefsum+=arr[i];
        }
        return -1;
    }
}