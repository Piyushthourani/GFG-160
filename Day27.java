
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/merge-two-sorted-arrays-1587115620

import java.util.Arrays;
public class Day27 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }

    static void mergeSortedArrays(int[] a, int[] b) {
        int i=a.length-1,j=0;
        while(i>=0 && j<b.length
        {
            if(a[i]<b[j])
            {
                i--;
            }
            else
            {
                int temp=b[j];
                b[j]=a[i];
                a[i]=temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
