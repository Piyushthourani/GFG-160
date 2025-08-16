
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/longest-distinct-characters-in-string5848

public class Day58 {
    public static void main(String[] args) {
        String s = "abcabecbb";
        System.out.println("Length of longest substring is: " + longestDistinctSubstring(s));
    }

    public static int longestDistinctSubstring(String s) {
        int n=s.length();
        if(n==0 || n==1)
        return n;
        
        int ans=0;
        boolean vis[]=new boolean[26];
        
        int left=0,right=0;
        while(right<n)
        {
            while(vis[s.charAt(right)-'a']==true)
            {
                vis[s.charAt(left)-'a']=false;
                left++;
            }
            vis[s.charAt(right)-'a']=true;
            ans=Math.max(ans,(right-left+1));
            
            right++;
        }
        return ans;
    }
}