
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix17201720

public class Day38 {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        int x = 29;
        if (matSearch(mat, x))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int i=0,j=mat[0].length-1;
        while(i<mat.length && j>=0)
        {
            if(x>mat[i][j])
            i++;
            else if(x<mat[i][j])
            j--;
            else
            return true;
        }
        return false;
    }
}
