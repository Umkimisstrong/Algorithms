package Java_Test;


/*
    Test002 
    : 알고리즘 - 두 개의 숫자 추가

    두 개의 음수가 아닌 정수를 나타내는 배열이 제공될 때,
    숫자는 역순으로 저장되며 각 노드에는 단일 숫자가 포함된다.
    두 숫자를 더하고 합계를 배열로 반환하는 로직

    ① = [2 4 3] / [5, 6, 4]
      -> [7, 0, 8]
      ∵
*/


public class Test002
{


   
    // main 메소드
    public static void main(String args[])
    {
        String [] A1 = new String [7];
        A1[0] = "9";
        A1[1] = "9";
        A1[2] = "9";
        A1[3] = "9";
        A1[4] = "9";
        A1[5] = "9";
        A1[6] = "9";

        String [] A2 = new String [4];
        A2[0] = "9";
        A2[1] = "9";
        A2[2] = "9";
        A2[3] = "9";

        Test002 abc = new Test002();

        String [] result = abc.addTwoNumbers(A1, A2);

         for(int i = 0; i<result.length; i++)
         {
             System.out.println(result[i].toString());
         }


        
    }

     // 메소드 구현
    public String [] addTwoNumbers(String [] A1 , String [] A2)
    {
        String [] result = null;

        if(A1 == null || A2 == null)
        {
            result = new String[1];
            result[0] = "NOTHING";
        }
        else
        {
            String resultOf_A1 = "";
            int resultOf_strA1 = 0;

            
            // 거꾸로 돌린다.
            for(int i = A1.length-1; i>=0;i--)
            {
                resultOf_A1 += A1[i];
            }

            resultOf_strA1 = Integer.parseInt(resultOf_A1);


            String resultOf_A2 = "";
            int resultOf_strA2 = 0;
            // 거꾸로 돌린다.
            for(int i = A2.length-1; i>=0;i--)
            {
                resultOf_A2 += A2[i];
            }
        
            resultOf_strA2 = Integer.parseInt(resultOf_A2);

            
            int sum = resultOf_strA1 + resultOf_strA2;

            String intSum = Integer.toString(sum);
            result = new String[intSum.length()];
            //[807]
            int inputIndex = 0;
            for(int i = intSum.length()-1; i>=0;i--)
            {
                
                result[inputIndex] = Character.toString(intSum.charAt(i));
                inputIndex++;

            }

        }

        return result;

    }

   
}
