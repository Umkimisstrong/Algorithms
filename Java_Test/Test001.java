package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test001 
    : 알고리즘 - 파스칼의 삼각형 관련 출력해보기
*/

public class Test001
{

    // main 메소드
    public static void main(String args[])
    {
        List<Integer> arr = getRow(33);

        if(arr != null)
        {
            for(int k = 0; k < arr.size(); k ++)
            {
                System.out.println(arr.get(k));
            }
        }
        else
        {
            System.out.println("에러");
        }
        
    }

    // getRow - 파스칼의 삼각형 
    public static List<Integer> getRow(int rowIndex) 
    {

        List<Integer> result = null;

        if(rowIndex <= 33 && rowIndex >= 0)
        {
            // 전체 반복 횟수
            int arrWholeNum = rowIndex + 1;
            
            result = new ArrayList<Integer>();


            for(int i = 1; i <= arrWholeNum; i++)
            {
                int varNum = 0;
                if(i == 1 || i == arrWholeNum)
                {
                    varNum = 1;
                }
                else
                {
                    varNum = rowIndex;
                }

                result.add(varNum);

            }
            
        }
        

        return result;
    }
}
