
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/rotate-by-90-degree-1587115621

public class Day37 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        rotateMatrix(matrix);
        
        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);
    }
    
    public static void rotateMatrix(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            int start=0,end=n-1;
            while(start<=end)
            {
                int temp=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
