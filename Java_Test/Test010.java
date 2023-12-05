package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test010
    : 알고리즘 - 

      - 입력 : 121
      - 출력 : true

      - 입력 : -121
      - 출력 : false
*/


public class Test010
{
    public boolean isPalindrome(int x)
    {
        boolean result = false;

        if ( x<0 )
            result = false;
        else
        {
            // 양수인 경우 확인한다.
            String temp = Integer.toString(x);
            String temp2 = "";
            
            for(int i =0; i<temp.length(); i++)
            {
                temp2 += Character.toString(temp.charAt(temp.length()-1-i));
            }

            result = temp.equals(temp2);

        }
        return result;
    }
   
    // main 메소드
    public static void main(String args[])
    {
        Test010 obj = new Test010();
        
        // todo 
        System.out.println(
            obj.isPalindrome(121) ? "true" : "false"
        );
          System.out.println(
            obj.isPalindrome(-121) ? "true" : "false"
        );
          System.out.println(
            obj.isPalindrome(21) ? "true" : "false"
        );
          System.out.println(
            obj.isPalindrome(3) ? "true" : "false"
        );

        
    }

     

   
}
