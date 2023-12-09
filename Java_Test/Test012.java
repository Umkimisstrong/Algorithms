package Java_Test;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Test012
    : 알고리즘 - 정수형을 로마형으로 바꾸기 Int to Roman


      - 입력 : 3
      - 출력 : "III"

      - 입력 : 58
      - 출력 : LVIII (L = 50 V = 5 III = 3)

      - 입력 : 1994
      - 출력 : MCMXCIV (M = 1000, CM = 900, XC = 90, IV = 4)
      
      * constraint : 1<= num <= 3999

      I             1
      V             5
      X             10
      L             50
      C             100
      D             500
      M             1000
*/


public class Test012
{

    // main 메소드
    public static void main(String args[])
    {
        Test012 obj = new Test012();
        
        System.out.println(obj.intToRoman(3));
        System.out.println(obj.intToRoman(58));
        System.out.println(obj.intToRoman(1994));

        /*
            III
            LVIII  
            MCMXCIV
        */
        
    }
    
    
    
    public String repeat(String s, int n) 
    {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public String intToRoman(int Int)
    {
         LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
         roman_numerals.put("M", 1000);
         roman_numerals.put("CM", 900);
         roman_numerals.put("D", 500);
         roman_numerals.put("CD", 400);
         roman_numerals.put("C", 100);
         roman_numerals.put("XC", 90);
         roman_numerals.put("L", 50);
         roman_numerals.put("XL", 40);
         roman_numerals.put("X", 10);
         roman_numerals.put("IX", 9);
         roman_numerals.put("V", 5);
         roman_numerals.put("IV", 4);
         roman_numerals.put("I", 1);

         String res = "";
         for(Map.Entry<String, Integer> entry : roman_numerals.entrySet())
         {
           int matches = Int/entry.getValue();
           res += repeat(entry.getKey(), matches);
           Int = Int % entry.getValue();
         }
         return res;
    }
}
