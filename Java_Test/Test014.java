package Java_Test;

import java.util.HashMap;
import java.util.Map;

/*
    Test014
    : 알고리즘 - 가장 긴 공통의 접두사 찾기 (Longest Common Prefix)

      - 입력 : ["flower", "flow", "flight"]
      - 출력 : "fl"

      - 입력 : ["dog", "racecar", "car"]
      - 출력 : 없음
*/      


public class Test014
{
    public String longestCommonPrefix(String [] strs)
    {
        String result = "";

        // strs 배열을 반복문을 돌면서 
        for(int i = 0; i<strs.length; i++)
        {
            // 길이가 제일 짧은 문자열을 앞으로 옮기는 작업
            // 끝을 더했기때문에 끝 인덱스 -1 보다 작거나 같은 경우에만 진행
            if(i <strs.length-1 &&
               strs[i].length() > strs[i+1].length()
                )
            {
                String temp = strs[i];
                strs[i] = strs[i+1];
                strs[i+1] = temp;
            }
        }

        // 줄세우기 완료(길이가 짧은 문자열이 맨 앞으로 옴)
        for(int j = 0; j<strs[0].length(); j++)
        {
            int sameCount = 0;



            // 길이가 짧은 문자열을 기준으로 비교한다.
            for(int i = 1; i<strs.length; i++)
            {

                // 기준문자열의 문자와
                // 비교대상들의 문자가 같으면 (같은 위치)
                // int 변수를 증가시킨다.
                // 전체 갯수 = length
                // 자신을 제외한 나머지 문자열이 모두 같다 = length - 1 이 sameCount 인 경우
                // ex) 전체 문자열은 3개이고, 자신을 제외한 비교값이 2번 같으면 sameCount = 2
                //     그렇다면 공통의 문자열을 모두 같고있다는 증거이기 때문에, 
                //     비교가 끝나는 시점에 sameCount 가 length - 1 이냐는 조건을 달고 반복문을 종료시키거나 지속시킨다.
                if(strs[0].charAt(j) == strs[i].charAt(j))
                {
                    sameCount++;
                }
            }

            // 비교한 문자열이 모두 다른 경우 반복문을 빠져나간다.
            if(sameCount != strs.length-1)
            {
                break;
            }
            else
            {
                // 같다면 result 문자열에 더해준다. 기준문자열에 있는 그 문자를
                result += Character.toString(strs[0].charAt(j));
            }
        }
        

        return result;
    }
    // main 메소드
    public static void main(String args[])
    {
        Test014 obj = new Test014();

        //String [] strs = {"flowers", "flow", "flight"};
        String [] strs = {"flowers", "flow", "floght"};

        System.out.println(obj.longestCommonPrefix(strs));
        
    }
    
   
}
