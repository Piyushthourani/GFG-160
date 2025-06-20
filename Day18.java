
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205

import java.util.*;
public class Day18 {
    public static void main(String[] args) {
        String str = "geeksforgeeks"; // Example string, you can change it to test with different inputs
        String pattern = "geeks"; // Example pattern, you can change it to test with different inputs
        
        System.out.println("Input string: " + str);
        System.out.println("Input pattern: " + pattern);
        
        System.out.println("Pattern found at indices: " + searchPattern(str, pattern));
    }
    public static ArrayList<Integer> searchPattern(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
         ArrayList<Integer>list = new ArrayList<>();
         if ( m > n) {
            return list; 
        }
       for(int i = 0 ; i <= n-m ; i++){
           if(str.substring(i , i+m).equals(pattern)){
               list.add(i);
           }
       }
        
         return list ;
    }
}
