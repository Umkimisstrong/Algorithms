package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test008 
    : 알고리즘 - 문자열을 넘겨받아 정수형으로 반환하기
      - 입력 : "42"
      - 출력 : 42
      
      - 입력 : "       -42"
      - 출력 : -42

      - 입력 : "4193 with words"
      - 출력 : 4193

*/


public class Test008
{
    public int myAtoi(String s)
    {
        int result = 0;

        // 공백 제거
        s = s.replaceAll(" ", "");
        
        ArrayList<String> arrList = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '-'
               || s.charAt(i) == '0'
               || s.charAt(i) == '1'
               || s.charAt(i) == '2'
               || s.charAt(i) == '3'
               || s.charAt(i) == '4'
               || s.charAt(i) == '5'
               || s.charAt(i) == '6'
               || s.charAt(i) == '7'
               || s.charAt(i) == '8'
               || s.charAt(i) == '9'
              )
            {
                arrList.add(Character.toString(s.charAt(i)));
            }
            
        }

        StringBuilder sb = new StringBuilder();



        for(int i = 0; i<arrList.size(); i++)
        {
            sb.append(arrList.get(i));   
        }


        result = Integer.parseInt(sb.toString());

        return result;
    }
   
    // main 메소드
    public static void main(String args[])
    {
        Test008 obj = new Test008();
        
        System.out.println(obj.myAtoi("   312"));
        System.out.println(obj.myAtoi("312"));
        System.out.println(obj.myAtoi("-312"));
        System.out.println(obj.myAtoi("4193 with words"));

        
    }

     

   
}
