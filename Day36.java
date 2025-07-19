
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/spirally-traversing-a-matrix-1587115621

import java.util.ArrayList;

public class Day36 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println("Spiral Traversal of the Matrix:");
        System.out.println(spiralTraversal(matrix));
    }

    public static ArrayList<Integer> spiralTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        int m=mat.length;
        int n=mat[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                li.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                li.add(mat[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    li.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    li.add(mat[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}
