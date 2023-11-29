package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test005 
    : 알고리즘 - 하나의 문자열을 넘겨받아 가장 긴 문자들을 반환
      - 입력 : babad
      - 출력 : bab (aba)
      
      - 입력 : cbbd
      - 출력 : bb
*/


public class Test005
{

    static void printSubStr(String str, int low, int high)
    {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }
 
    public int longestPalindrome(String s)
    {
        int result = 0;
    
        int n = s.length();

        int maxLength =1;
        int start = 0;

        

        // 1. 반복문 안에서 
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = 0; j<s.length(); j++)
            {
                int flag = 1;

                for(int k = 0; k< (j-i+1)/2; k++)
                {
                    if(s.charAt(i+k) != s.charAt(j-k))
                    {
                        flag = 0;
                    }

                    
                }

                if(flag != 0 && (j-i+1) > maxLength)
                {
                        start = i;
                        maxLength = j-i+1;
                }

            }
            

        }

        printSubStr(s, start, start+maxLength -1 );

        result = maxLength;
        return result;
    }

   
    // main 메소드
    public static void main(String args[])
    {
        Test005 obj = new Test005();
        String str = "cbbd";
        System.out.print("\nLength is: "
                         + obj.longestPalindrome(str));
    }

     

   
}
