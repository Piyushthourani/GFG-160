
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/minimum-characters-to-be-added-at-front-to-make-string-palindrome

public class Day19 {
    public static void main(String[] args) {
        String str = "abc"; // Example string, you can change it to test with different inputs
        System.out.println("Minimum characters to be added at front to make string palindrome: " + minCharsToMakePalindrome(str));
    }

    static int minCharsToMakePalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int[] lps = new int[concat.length()];
        int j = 0;
        for (int i = 1; i < concat.length(); i++) {
            while (j > 0 && concat.charAt(i) != concat.charAt(j)) {
                j = lps[j - 1];
            }
            if (concat.charAt(i) == concat.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        return s.length() - lps[concat.length() - 1];
    }
}
