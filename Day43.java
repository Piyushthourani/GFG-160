
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-pairs-with-given-sum--150253

import java.util.HashMap;

public class Day43 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println("Count of pairs with given sum: " + countPairsWithSum(arr, sum));
    }

    public static int countPairsWithSum(int[] arr, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=0;
        for(int i:arr)
        {
            if(mp.containsKey(target-i))
            c += mp.get(target-i);
            
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        return c;
    }
}
