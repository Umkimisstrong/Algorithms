package Java_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
    Test015
    : 알고리즘 - 3SUM(삼중항의 합이 0이 되는 조합을 각기 다르게 출력한다.)

      - 입력 : [-1, 0, 1, 2, -1, -4]
      - 출력 : [[-1, -1, 2], [-1, 0, 1]]

      - 입력 : [0, 1, 1]
      - 출력 : []
*/      


public class Test015
{

    public List<List<Integer>> threeSum(int [] nums)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        Arrays.sort(nums);

        for(int i =0; i<nums.length-2; i++)
        {
            if(
                i>0 
                &&
                nums[i] == nums[i-1]
              )
              continue;

              int left = i + 1;
              int right = nums.length - 1;

              while(left < right)
              {
                    int sum = nums[left] + nums[right] + nums[i];

                    if( sum == 0)   // 합이0인경우
                    {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while(nums[left] == nums[left-1] && left < right)
                        {
                            left++;
                        }
                        while(nums[right] == nums[right+1] && left < right)
                        {
                            right--;
                        }
                    }
                    else if(sum > 0)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
              }
        }

        
        return result;
    }
    // main 메소드
    public static void main(String args[])
    {
        Test015 obj = new Test015();

        int [] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = obj.threeSum(nums);

        StringBuilder sb = new StringBuilder();
        for(List<Integer> list : result)
        {
            int index = 0;
            sb.append("[ ");
            for(int num : list)
            {
                sb.append(Integer.toString(num));
                if(index != list.size()-1)
                {
                    sb.append(", ");
                }
                index++;
            }
            sb.append(" ]");

        }

        String strResult = sb.toString();
        System.out.println(strResult);
        
    }
    
   
}
