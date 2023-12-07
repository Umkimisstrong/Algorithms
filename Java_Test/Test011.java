package Java_Test;

/*
    Test011
    : 알고리즘 - 물이 가장 많은 용기(int 배열을 입력받아 가상의 축을 만들어 용기라고 판단하고 
                최대로 물을 담을 수 있는 면적을 구하기)
            
                * 상상력 
                  
                  7-                                          
                  6-                                          
                  5-    ■       ■                               
                  4-    ■   ■   ■     ■           높이 : 4                    
                  3-  ■ ■   ■   ■     ■           너비 : 6                
                  2-  ■ ■   ■ ■ ■   ■ ■           최대면적 : 24                 
                  1-  ■ ■ ■ ■ ■ ■ ■ ■ ■                            
                  ----------------------------------------------


      - 입력 : [1, 8, 6, 2, 5, 4, 8, 3, 7]
      - 출력 : 49

      - 입력 : [1, 1]
      - 출력 : 1

*/


public class Test011
{

    // main 메소드
    public static void main(String args[])
    {
        Test011 obj = new Test011();
        
        
        int [] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(Integer.toString(obj.maxArea(arr)));
        
    }
    
    public int maxArea(int [] height)
    {
        int Area = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right)
        {
            Area = Math.max(Area, getArea(left, right, height));
            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return Area;
    }

    
   

    public int getArea(int left, int right, int [] height)
    {
        int w = right - left, h = Math.min(height[left], height[right]);

        return w * h;
    }


 

     

   
}
