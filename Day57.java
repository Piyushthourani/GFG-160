
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-distinct-elements-in-every-window

import java.util.ArrayList;
import java.util.HashMap;

public class Day57 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList<Integer> result = countDistinctElements(arr, k);
        System.out.println(result);
    }

    static ArrayList<Integer> countDistinctElements(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k > arr.length) return result;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size());
        for (int i = k; i < arr.length; i++) {
            int outElem = arr[i - k];
            freqMap.put(outElem, freqMap.get(outElem) - 1);
            if (freqMap.get(outElem) == 0) {
                freqMap.remove(outElem);
            }
            int inElem = arr[i];
            freqMap.put(inElem, freqMap.getOrDefault(inElem, 0) + 1);
            result.add(freqMap.size());
        }
        return result;
    }
}
