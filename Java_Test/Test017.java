package Java_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
    Test017
    : 알고리즘 - Letter Combinations of Phone Number

      - 입력 : 23
      - 출력 : ad, ae, af, bd, be, bf, cd, ce, cf
      - 설명 : 1 --- / 2 - abc / 3 - def
               4 ghi / 5 - jkl / 6 - mno
               7 pqrs / 8 - tuv / 9 - wxyz
               * - + / 0 " " / # ↑
               --> 휴대폰을 상상한다.
      

*/      


public class Test017
{



    // main 메소드
    public static void main(String args[])
    {
        Test017 obj = new Test017();
        List<String> test = obj.letterCombinations("23");

        StringBuilder sb = new StringBuilder();
        for(String result : test)
        {
            sb.append(result);
            sb.append(". ");
        }

        System.out.println(sb.toString());
    }

    public String [] TABLE = new String [] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations (String digits)
    {
        if(digits.isEmpty())
            return Collections.emptyList();


        char [] digitChars = digits.toCharArray();
        int [] numbers = new int [digitChars.length];

        for(int i= 0; i<digitChars.length;i++)
        {
            numbers[i] = digitChars[i] - '0';
        }

        int length = numbers.length;

        return letterCombinationUtil(numbers, length);
    }

    public List<String> letterCombinationUtil ( int [] numbers, int length)
    {
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();


        queue.add("");
        String letterCombination, letters;

        while(!queue.isEmpty())
        {
            letterCombination = queue.poll();
            if(letterCombination.length() == length)
            {
                list.add(letterCombination);
                continue;
            }
            letters = TABLE [numbers[letterCombination.length()]];
            for(int i = 0; i<letters.length(); i++)
            {
                queue.add(letterCombination + letters.charAt(i));
            }
        }

        return list;
    
    }
    
   
   
}
