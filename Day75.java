
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/permutations-of-a-given-string2041

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day75 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of the string:");
        System.out.println(findPermutation(str));
    }
    static void genPermutations(int len, StringBuilder str, Map<Character,Integer> mp, ArrayList<String> ans) {
        
        if(str.length()==len)
        {
            ans.add(str.toString());
            return ;
        }
        
        for(Map.Entry<Character, Integer> entry : mp.entrySet())
        {
            char c = entry.getKey();
            int count = entry.getValue();
            
            if(count==0)
            continue;
            
            str.append(c);
            mp.put(c,count-1);
            
            genPermutations(len,str,mp,ans);
            
            str.deleteCharAt(str.length()-1);
            mp.put(c,count);
        }
        
    }
    
    public static ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        Map<Character,Integer> mp = new HashMap<>();
        
        for(char c: s.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
            
        }
        StringBuilder str=new StringBuilder();
        genPermutations(s.length(),str,mp,ans);
        return ans;
    }

}
