
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/word-search

public class Day79 {

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(isWordExist(board, word)); // Output: true
    }
    static boolean findmatch(char mat[][], String word, int i,int j,int idx)
    {
        int len=word.length();
        int n=mat.length;
        int m=mat[0].length;
        
        if(idx==len)
        return true;
        
        if(i<0 || j<0|| i>=n || j>=m)
        return false;
        
        if(mat[i][j]==word.charAt(idx))
        {
            char temp=mat[i][j];
            mat[i][j]='#';
            
            boolean ans = findmatch(mat,word,i-1,j,idx+1) ||
                          findmatch(mat,word,i+1,j,idx+1) ||
                          findmatch(mat,word,i,j-1,idx+1) ||
                          findmatch(mat,word,i,j+1,idx+1);
                          
            mat[i][j]=temp;
            return ans;
        }
        return false;
        
    }
    
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int len=word.length();
        int n=mat.length;
        int m=mat[0].length;
        
        if(len>n*m)
        return false;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==word.charAt(0))
                {
                    if(findmatch(mat,word,i,j,0))
                    return true;
                }
            }
        }
        return false;
    }
}