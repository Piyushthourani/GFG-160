
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751

public class Day2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12}; // Example array, you can change it to test with different inputs
        
        System.out.println("Array before moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        moveZeroes(arr);
        
        System.out.println("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZeroes(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                j++;
            }
        }
    }
    
}