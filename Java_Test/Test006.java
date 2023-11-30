package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test006 
    : 알고리즘 - 지그재그 컨버젼
      - 입력 : String s = "PAYPALISHIRING", int numRows = 3
      - 출력 : PAHNAPLSIIGYIR
      - 설명 : P   A   H   N
      - 계속 : A P L S I I G
      - 계속 : Y   I   R



*/


public class Test006
{

    static String convert(String str, int numRow)
    {
        // length = 14
        String result = "";
        /*
            00 01 02 03 04 05 06
            10 11 12 13 14 15 16

            00      02      04      06
            10  11  12  13  14  15  16
            20      22      24


            00       03       06      
            10    12 13    15 16
            20 21    23 24      
            30       33   

            00          04
            10       13 14
            20    22    24
            30 31       34 35
            40          44

        */
        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();

        for(int i=0; i<numRow; i++)
            list.add(new ArrayList<Character>());

        // 3줄짜리 리스트를 리스트에 담는다.
        
        int row = 0;
        int zig = numRow-2;
        int zigidx = 1;
        for(int i = 0; i<str.length(); i++)
        {
            char temp = str.charAt(i);

            if(row>=numRow && zig<=0)
            {
                row = 0;
                zig = numRow-2;
                zigidx = 1;
            }

            if(row<numRow)
            {
                list.get(row).add(temp);
                row++;
                continue;
            }

            if(zig>0)
            {
                list.get(row-zigidx-1).add(temp);
                zig--;
                zigidx++;
            }
        }

        StringBuilder sb = new StringBuilder();//정답
        for(int i=0; i<list.size(); i++) {
        	for(int j=0; j<list.get(i).size(); j++) {
        		sb.append(list.get(i).get(j));
        	}
        }

        result = sb.toString();
        return result;
    }
 
   
    // main 메소드
    public static void main(String args[])
    {
        Test006 obj = new Test006();
        String str = "PAYPALISHIRING";
        System.out.print(convert(str, 3));
    }

     

   
}
