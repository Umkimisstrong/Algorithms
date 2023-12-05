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
        boolean result = 0;

        

        switch (s.equals(p))
        {
            // 같은 경우
            case true:
                result = true;
                break;

            // 다른 경우
            case false:

            // 비교문자열 안에 . 또는 * 가 아예 없는 경우
            if(     p.indexOf("*") == -1 
               &&   p.indexOf((".") == -1)
                 )
            {
                result = false;
            }
            else
            {
                if(p.equals("*"))
                    result = true;  // 비교군 * 인경우
                else if(s.length() == 1 && p.equals("."))   // 비교대상이 어떤문자던 1개인 경우와 비교군이 . 인경우
                    result = true;
                else
                {
                    
                    // 1. 문자열 각각 담기 위한 배열 생성
                    String [] arr_S = new String [s.length()];
                    for(int i = 0; i<s.length(); i++)
                    {
                        arr_S[i] = Character.toString(s.charAt(i));
                    }

                    String [] arr_P = new String [p.length()];
                    for(int i = 0; i<s.length(); i++)
                    {
                        arr_P[i] = Character.toString(P.charAt(i));
                    }

                    
                    // 두 문자열의 길이가 같은 경우 그냥 비교
                    for(int i = 0; i<s.length(); i++)
                    {
                        if(arr_P[i].equals("."))
                        {
                            result = true;
                        }
                        else
                        {
                            if(arr_S[i].equals(arr_P[i]))
                            {
                                result = true;
                            }
                            else
                            {
                                result = false;
                            }
                        }
                    }

                    // 두 문자열의 길이가 다른 경우 
                }    
                



            }

                break;
        }




        return result;
    }
   
    // main 메소드
    public static void main(String args[])
    {
        Test010 obj = new Test010();
        
       

        
    }

     

   
}
