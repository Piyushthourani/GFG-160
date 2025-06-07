// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
// Only one transaction is allowed, find the maximum profit you can achieve from this transaction.


// import java.util.*;
public class Day8 {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695}; // Example prices array, you can change it to test with different inputs
        
        System.out.println("Maximum profit: " + maxProfit(prices));
    }

    // Function to calculate the maximum profit
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bp = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(bp >= prices[i]){
                bp = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit,prices[i]-bp);
            }
        }
        
        return maxProfit;
    }
}
