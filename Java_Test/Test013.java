package Java_Test;

import java.util.HashMap;
import java.util.Map;

/*
    Test013
    : 알고리즘 - 로마형을 정수형으로 바꾸기(Roman To Integer)
*/


public class Test013
{

    private static final Map<String, Integer> romanSymbolMap = new HashMap<>()
    {
        {
            put("M", 1000);
            put("CM", 900);
            put("D", 500);
            put("CD", 400);
            put("C", 100);
            put("XC", 90);
            put("L", 50);
            put("XL", 40);
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }
    };

    public int romanToInt(String s)
    {
        int result = 0;

        for(int i = 0; i<s.length();)
        {
            String twoChSubStr = s.substring(i, Math.min(s.length(), i+2));
            String oneChSubStr = s.substring(i, i+1);

            if(romanSymbolMap.containsKey(twoChSubStr))
            {
                result += romanSymbolMap.get(twoChSubStr);
                i += 2;
            }
            else
            {
                result += romanSymbolMap.get(oneChSubStr);
                i++;
            }
        }
        return result;

    }

    // main 메소드
    public static void main(String args[])
    {
        Test013 obj = new Test013();

        System.out.println(obj.romanToInt("III"));
        System.out.println(obj.romanToInt("LVIII"));
        System.out.println(obj.romanToInt("MCMXCIV"));
        
    }
    
   
}
