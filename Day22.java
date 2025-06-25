
// Problem Link :https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/find-h-index--165609

// import java.util.*;

class Day22 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int hIndex = findHIndex(citations);
        System.out.println("H-Index: " + hIndex);
    }
    static int findHIndex(int[] citations) {
        int maxCitation = 0;
        for (int citation : citations) {
            maxCitation = Math.max(maxCitation, citation);
        }
        int[] count = new int[maxCitation + 2];
        for (int citation : citations) {
            count[0]++;
            count[citation + 1]--;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] >= i) {
                return i;
            }
        }
        return 0;
    }
}
