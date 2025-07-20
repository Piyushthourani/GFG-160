
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-row-wise-sorted-matrix


public class Day39 {
    public static void main(String[] args) {
        
        int[][] mat = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int x = 29;
        if (searchRowMatrix(mat, x))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    public static boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            int start=0,end=m-1;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(mat[i][mid]==x)
                {
                    return true;
                }
                else if(mat[i][mid]>x)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return false;
    }
}
