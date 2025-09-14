
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/solve-the-sudoku-1587115621

public class Day78 {
    public static void main(String[] args) {
        int board[][] = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        
        if(solveSudoku(board))
        {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        }
        else
        {
            System.out.println("No solution exists");
        }
    }
    static boolean isSafe(int mat[][], int i,int j,int num,int row[],int col[],int box[])
    {
        if((row[i] & (1<<num))!=0 || (col[j] & (1<<num))!=0 || 
        (box[i/3 *3+ j/3] & (1<<num))!=0)
        return false;
        
        return true;
    }
    
    static boolean sudokusolver(int mat[][], int i,int j, int row[], int col[], int box[])
    {
        int n=mat.length;
        if(i==n)
         return true;
         
        if(j==n)
        {
            return sudokusolver(mat,i+1,0,row,col,box);
        }
        
        if(mat[i][j]!=0)
         return sudokusolver(mat,i,j+1,row,col,box);
         
        for(int num=1;num<=n;num++)
        {
            if(isSafe(mat,i,j,num,row,col,box))
            {
                mat[i][j]=num;
                
                row[i] |= (1<<num);
                col[j] |=(1<<num);
                box[i/3*3+j/3] |=(1<<num);
                 if(sudokusolver(mat,i,j+1,row,col,box))
                 return true;
                 
                mat[i][j]=0;
                row[i] &= ~(1<<num);
                col[j] &= ~(1<<num);
                box[i/3*3+j/3] &= ~(1<<num);
            }
        }
        return false;
        
    }
    // Function to find a solved Sudoku.
    static boolean solveSudoku(int[][] mat) {
        // code here
        int n=mat.length;
        int row[]=new int[n];
        int col[]=new int[n];
        int box[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=0)
                {
                    row[i] |= (1<<mat[i][j]);
                    col[j] |= (1<<mat[i][j]);
                    box[(i/3)*3 + j/3] |= (1<<mat[i][j]);
                }
            }
        }
        return sudokusolver(mat,0,0,row,col,box);
    }
    
    static void printBoard(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
