
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615

// import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695}; // Example prices array, you can change it to test with different inputs
        
        System.out.println("Maximum profit: " + maxProfit(prices));
    }

    // Function to calculate the maximum profit
    static int maxProfit(int[] prices) {
        int sum=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            sum+=prices[i]-prices[i-1];
        }
        return sum;
    }
}
