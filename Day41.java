
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/set-matrix-zeroes

public class Day41 {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {1, 2, 6, 2},
            {1, 3, 1, 8}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        setZeroes(matrix);
        
        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }
    
    public static void setZeroes(int[][] mat) {
         int n=mat.length;
        int m=mat[0].length;
        int c0=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[i][0]=0;
                    if(j==0)
                    c0=0;
                    else
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(mat[i][0]==0 || mat[0][j]==0)
                {
                    mat[i][j]=0;
                }
            }
        }
        
        if(mat[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                mat[0][j]=0;
            }
        }
        if(c0==0)
        {
            for(int i=0;i<n;i++)
            {
                mat[i][0]=0;
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
    }
        }
        
}
