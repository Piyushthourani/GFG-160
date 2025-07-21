
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix-1587115621

public class Day40 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {61, 70, 80, 90}
        };
        int target = 3;
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
    public static boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length;
        int m=mat[0].length;
        int start=0,end=n*m-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int row=mid/m;
            int col=mid%m;
            
            if(mat[row][col]==x)
            return true;
            else if(mat[row][col]<x)
            start=mid+1;
            else
            end=mid-1;
        }
        return false;
    }
}
