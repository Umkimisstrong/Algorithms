package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test010
    : 알고리즘 - 정규식 매칭

      - 입력 : s = "aa", p = "a"
      - 출력 : false

      - 입력 : s = "aa", p = "a*"
      - 출력 : true

      - 입력 : s = "ab", p = ".*"
      - 출력 : true
*/


public class Test010
{
    public boolean isMatch(String s, String p)
    {
        int rows = s.length();
        int columns = p.length();


        /// Base conditions
        if (rows == 0 && columns == 0) {
            return true;
        }
        if (columns == 0)
        {
            return false;
        }

        // DP array
        boolean[][] dp = new boolean[rows + 1][columns + 1];

        // Empty string and empty pattern are a match
        dp[0][0] = true;

        // Deals with patterns with *
        for (int i = 2; i < columns + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        
        // For remaining characters
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (j > 1 && p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] | dp[i - 1][j];
                    }
                }
            }
        }
        return dp[rows][columns];
    }
   
    // main 메소드
    public static void main(String args[])
    {
        Test010 obj = new Test010();
        
        System.out.println(obj.isMatch("aa", "a*") ? "true ": "false");
        System.out.println(obj.isMatch("aa", "aa") ? "true ": "false");
        System.out.println(obj.isMatch("ab", ".*") ? "true ": "false");
        System.out.println(obj.isMatch("aa", "ab") ? "true ": "false");

        
    }

     

   
}
