package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test007 
    : 알고리즘 - 정수 뒤집기
      - 입력 : 123
      - 출력 : 321
      
      - 입력 : -123
      - 출력 : -321



*/


public class Test007
{

    public int reverse(int x)
    {
        int result = 0;

        if(Integer.MAX_VALUE < x   || Integer.MIN_VALUE > x  || x == 0)
        {
            result = 0;
        }
        else
        {
            String strInteger = Integer.toString(x);

            ArrayList<String> arrList = new ArrayList<String>();

            int length = strInteger.length();
            if(x>0)
            {
                // 양수의 경우 거꾸로 담는다.
                for(int i = 0; i<strInteger.length(); i++)
                {
                    arrList.add(Character.toString(strInteger.charAt(length-1)));
                    length--;
                }
            
                StringBuilder sb = new StringBuilder();
                String strResult = "";
                for(int i = 0; i< arrList.size(); i++)
                {
                    sb.append(
                                arrList.get(i).equals("0") && i == 0        // 첫번째이면서 정수가 0이면 공백으로 append
                                                ?   ""
                                                :   arrList.get(i)
                             );
                }

                strResult = sb.toString();
                result = Integer.parseInt(strResult);
                
            }
            else
            {
                // 음수의 경우 거꾸로 담는다.
                for(int i = 0; i< strInteger.length(); i++)
                {
                    arrList.add(Character.toString(strInteger.charAt(length-1)));
                    length--;
                }

                StringBuilder sb = new StringBuilder();
                String strResult = "";

                // 맨 마지막은 - 문자열이라고 가정하고 넣지않는다.
                for(int i = 0; i< arrList.size(); i++)
                {
                    if(i != arrList.size()-1)
                    {
                        sb.append(
                                arrList.get(i).equals("0") && i == 0        // 첫번째이면서 정수가 0이면 공백으로 append
                                                ?   ""
                                                :   arrList.get(i)
                             );
                    }
                    
                }

                strResult = "-" + sb.toString();
                result = (Integer.parseInt(strResult));
            }
            
        }
        return result;
    }
 
   
    // main 메소드
    public static void main(String args[])
    {
        Test007 obj = new Test007();
        
        System.out.print(Integer.toString(obj.reverse(120)));
        
    }

     

   
}
