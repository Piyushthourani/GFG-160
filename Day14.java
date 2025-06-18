

// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/implement-atoi


public class Day14 {
    public static void main(String[] args) {
        String s = "  -0012gfg4"; // Example string, you can change it to test with different inputs
        int ans = myAtoi(s);
        System.out.println("String is : " + s);
        System.out.println("Converted integer is : " + ans);
    }

    static int myAtoi(String s) {
        s=s.trim();
        boolean neg = false;
        int i=0;
        if(s.charAt(0) == '-'){
            neg = true;
            i=1;
        }
        
        long res = 0;
        
        for(;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return neg ? (int)(res)*-1 : (int)res;
            }
            
            res = res*10+(s.charAt(i)-'0');
        }
        if(neg && res*-1 < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(res > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        return neg ? (int)(res)*-1 : (int)res;
    }
}