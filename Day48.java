// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/print-anagrams-together

import java.util.*;
public class Day48 {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        System.out.println(result);
    }

    static List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> li=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            String key=getHash(arr[i]);
            if(!mp.containsKey(key))
            {
                mp.put(key,li.size());
                li.add(new ArrayList<>());
            }
            li.get(mp.get(key)).add(arr[i]);
            
        }
        return li;
    }
    public static String getHash(String str){
        StringBuilder hash=new StringBuilder();
        int count[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            hash.append(count[i]);
            hash.append('$');
        }
        return hash.toString();
    
    }
}
