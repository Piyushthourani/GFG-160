
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/n-queen-problem0315

import java.util.ArrayList;

public class Day77 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(nQueen(n));
    }
    public static void nQueenUtil(int j, int n, ArrayList<Integer> board, boolean rows[],boolean diag1[], boolean diag2[], ArrayList<ArrayList<Integer>> ans  )
    {
        if(j>n)
        {
            ans.add(new ArrayList<>(board));
            return;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(!rows[i] && !diag1[i+j] && !diag2[i-j+n])
            {
                rows[i]= diag1[i+j] = diag2[i-j+n]=true;
                board.add(i);
                
                nQueenUtil(j+1,n,board,rows,diag1,diag2,ans);
                board.remove(board.size()-1);
                rows[i]= diag1[i+j] = diag2[i-j+n]=false;
            }
        }
    }
    
    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> board=new ArrayList<>();
        
        boolean rows[]=new boolean[n+1];
        
        boolean diag1[]=new boolean[2*n+1];
        boolean diag2[]=new boolean[2*n+1];
        
        nQueenUtil(1,n,board,rows,diag1,diag2,ans);
        return ans;
    }
}
