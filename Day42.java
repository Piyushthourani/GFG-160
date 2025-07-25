
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/key-pair5616

import java.util.HashSet;

public class Day42 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 6;
        if (hasPairWithSum(arr, sum)) {
            System.out.println("Pair found");
        } else {
            System.out.println("No pair found");
        }
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)
        {
            int temp=target-i;
            if(hs.contains(temp))
            return true;
            else
            hs.add(i);
        }
        return false;
    }
}
