package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test003 
    : 알고리즘 - 특정 문자열이 주어졌을 때 가장 긴 문자열의 길이를 찾기
      - 입력 : abcabcbb
      - 출력 : 3
      - 설명 : abc 이고 길이 3을 반환
*/


public class Test003
{

    public int lengthOfLongestSubstring(String s)
    {
        int result = 0;


        // "abcabcbb"
        // 1회전 :  ab / a b 삽입
        // 2회전 :  bc / c 삽입
        // 3회전 :  ca / 삽입 안함
        // 4회전 :  ab / 삽입 안함
        // 마지막 : 아무것도안함
        List<String> temp = new ArrayList<String>();

        for(int i = 0; i<s.length(); i++)
        {
            if(i != s.length()-1)
            {
                String a = Character.toString(s.charAt(i));
                String b = Character.toString(s.charAt(i+1));

                if(!a.equals(b))
                {
                    if(!temp.contains(a))
                    {
                        temp.add(a);
                    }
                    if(!temp.contains(b))
                    {
                        temp.add(b);
                    }
                    
                }
                else
                {
                    temp.clear();
                    temp.add(b);
                }
            }
            
            
        }

        if(temp.size() > 0)
            result = temp.size();

        return result;
    }

   
    // main 메소드
    public static void main(String args[])
    {
        Test003 obj = new Test003();

        int result1 = obj.lengthOfLongestSubstring("abcabcbb");
        int result2 = obj.lengthOfLongestSubstring("bbbbb");
        int result3 = obj.lengthOfLongestSubstring("pwwkew");
        System.out.println(Integer.toString(result1));
        System.out.println(Integer.toString(result2));
        System.out.println(Integer.toString(result3));
    }

     

   
}
