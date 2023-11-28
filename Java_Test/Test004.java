package Java_Test;

import java.util.ArrayList;
import java.util.List;

/*
    Test004 
    : 알고리즘 - 두 개의 정렬된 배열을 넘겨받아 중앙 값을 반환하는 메소드 구현
      - 입력 : [1, 3], [2]
      - 출력 : 2.00000
      - 설명 : 병합된 배열 = [1, 2, 3] 이고 중앙값 = [2]
*/


public class Test004
{

    public double findMedianSortedArrays(int [] nums1, int [] nums2)
    {
        double result = 0;

        int wholeLength = nums1.length + nums2.length;
        
        int [] wholeArrNums = new int [wholeLength];

        // 전체 배열에 담는다.
        for(int i = 0; i<wholeLength; i++)
        {
            // 1번배열의 것을 먼저 다 담아주고
            // 이후는 2번배열을 담는다.
            if(i <= nums1.length-1)
            {
                // 1회전 : i = 0
                //         -- wholeArrNums[0] = 1

                // 2회전 : i = 1
                //         -- wholeArrNums[1] = 3



                wholeArrNums[i] = nums1[i];
            }
            else
            {

                // 3회전 : i = 2
                //         -- wholeArrNums[2] = nums2[0]
                
                // 4회전 : i = 3
                //         -- wholeArrNums[3] = nums[1];
                wholeArrNums[i] = nums2[i-(nums1.length)];
            }
            
        }

        // 정렬
        for(int i = 0; i<wholeArrNums.length; i++)
        {
            if(wholeArrNums[i] > wholeArrNums[i+1] 
                && 
                i != wholeArrNums.length-1)
            {
                int temp = wholeArrNums[i+1];
                wholeArrNums[i+1] = wholeArrNums[i];
                wholeArrNums[i] = temp;
            }
        }


        // 배열의 갯수가 짝수개라면
        // 가운데 2개의 값을 선정하여 평균
        if(wholeArrNums.length % 2 == 0)
        {
            // ex) length : 4 / i = 0, 1, 2, 3                  -- 1, 2
            //              6 / i = 0, 1, 2, 3, 4, 5            -- 2, 3
            //              8 / i = 0, 1, 2, 3, 4, 5, 6, 7      -- 3, 4    
            //      

            //                                                  -- (length/2 -1), (length / 2)

            result = (wholeArrNums[wholeLength/2 - 1] + wholeArrNums[wholeLength/2] ) / 2;

        }
        // 배열의 갯수가 홀수개라면 
        // 가운데 값을 그냥 반환
        else
        {
            // ex) length : 3 / i = 0, 1, 2,                  -- 1
            //              5 / i = 0, 1, 2, 3, 4             -- 2
            //              7 / i = 0, 1, 2, 3, 4, 5, 6       -- 3
            //                                  

            //                                                -- (length+1)/2 - 1
            result = wholeArrNums[(wholeLength+1) / 2 -1];

        }

        return result;
    }

   
    // main 메소드
    public static void main(String args[])
    {
        Test004 obj = new Test004();

        int [] arr1 = new int[2];
        arr1[0] = 1;
        arr1[1] = 3;


        int [] arr2 = new int[1];
        arr2[0] = 2;

        double result = obj.findMedianSortedArrays(arr1, arr2);
    }

     

   
}
