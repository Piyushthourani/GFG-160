
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/powx-n

public class Day76 {
    public static void main(String[] args) {
        double x = 2.54;
        int n = 10;
        System.out.println("Result: " + myPow(x, n));
    }

    public static double myPow(double b, int e) {
        if(e==0)
        return 1;
        
        if(e<0)
        return 1/myPow(b,-e);
        
        double temp=myPow(b, e/2);
        
        if(e%2==0)
        return temp*temp;
        else
        return b*temp*temp;
    }
}

