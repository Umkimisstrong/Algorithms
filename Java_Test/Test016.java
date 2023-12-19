package Java_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
    Test016
    : 알고리즘 - 3SUM Closest(삼중항의 합이 0이 되는 조합을 각기 다르게 출력한다. 합이 Taget 에 가까운 3개의 정수의 합을 반환한다.)

      - 입력 : 배열 : [-1, 2, 1, -4], 타겟 : 1
      - 출력 : 2
      - 설명 : (-1 + 2 + 1) = 2, 배열의 요소들 중 합이 1에 가장 가까운 3개의 정수는 -1, 2, 1 이며 이의 합은 2이다.

      - 입력 : 배열 : [0, 0, 0], 타겟 : 1
      - 출력 : 0 
*/      


public class Test016
{

    // main 메소드
    public static void main(String args[])
    {
        Test016 obj = new Test016();

        int [] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(obj.threeSumClosest(nums, target));
        
    }
    
    public int threeSumClosest(int [] nums, int target)
    {
        int result = 0;

        if(nums.length < 3)                 
            result = 0;
        
        return result;
    }
   
}
