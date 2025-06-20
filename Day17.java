
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/non-repeating-character-1587115620

// import java.util.*;

public class Day17 {
    public static void main(String[] args) {
        String str = "geeksforgeeks"; // Example string, you can change it to test with different inputs
        System.out.println("Input string: " + str);
        System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(str));
    }

    static char firstNonRepeatingCharacter(String s) {
        int temp[]=new int[26];
        for(char c : s.toCharArray())
        {
            temp[c-'a']++;
        }
        for(char c:s.toCharArray())
        {
            if(temp[c-'a']==1)
            return c;
        }
        return '$';
    }
}