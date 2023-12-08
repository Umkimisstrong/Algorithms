package Java_Test;

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

      
        
    }
    
    public String intToRoman(int num)
    {
        String result = "";


        String IntegerFlags = "0";
       
        if(num >= 1000)
        {
            IntegerFlags = "3";
        }
        else if(num >= 100 && num < 1000)
        {
            IntegerFlags = "2";
        }
        else if(num >= 10 && num < 100)
        {
            IntegerFlags = "1";
        }
        
        switch (IntegerFlags) {
            case "0":
                result = intToRomanForOneLength(num);
                break;

            case "1" :
                result = intToRomanForTwoLength(num);
                break;

            case "2" :
                result = intToRomanForThreeLength(num);
                break;

            case "3" :
                result = intToRomanForFourLength(num);
                break;

            default:
                break;
        }
        
        return result;
    }

    // 1의자리 메소드
    public String intToRomanForOneLength(int num)
    {
        String result = "";
        int divided_five = num / 5;
        int restOfFive = num % 5;
        if(num == 9)
                {
                    result = "IX";
                }
                else if(num == 4)
                {
                    result = "IV";
                }
                else
                {
                    if(divided_five == 1)
                    {
                        result += "V";
                    }

                    if(restOfFive > 0)
                    {
                        for(int i = 0; i<restOfFive; i++)
                        {
                            result+= "I";
                        }
                    }
                }
        return result;
    }

    // 10의자리 메소드
    public String intToRomanForTwoLength(int num)
    {
        String result = "";

        int divided_fifty = num / 50;
        int restOfFifty = num % 50;
        
        if(num == 90)
        {
            result = "XC";
        }
        else if(num == 40)
        {
            result = "XL";
        }
        else if (num == 10)
        {
            result = "X";
        }
        else
        {
            if(divided_fifty == 1)
            {
                result += "L";
            }

            if(restOfFifty > 0)
            {
                
                    int divided_ten = restOfFifty / 10;
                    int restOfTen = restOfFifty % 10;

                    if(divided_ten>0)
                    {
                       
                        for(int i = 0; i<divided_ten; i++)
                        {
                                result+= "X";
                        }
                    }

                    // 자투리를 10으로 나눈 나머지가 0보다 크면 다시 그 수로 다시 5를 확인
                    if(restOfTen>0)
                    {
                         result += intToRomanForOneLength(restOfTen);
                    }
                            
            }
        }

        return result;
    }
   
    // 100의자리 메소드
    public String intToRomanForThreeLength(int num)
    {
        String result = "";
        // 3자리수
        int divided_fiveHund = num / 500;
        int restOfFiveHund = num % 500;
        
        if(num == 100)
        {
            result = "C";
        }
        else if(num == 400)
        {
            result = "CD";
        }
        else if(num == 900)
        {
            result = "CM";
        }
        else
        {
            if(divided_fiveHund == 1)
            {
                result += "D";
            }

            if(restOfFiveHund > 0)
            {
                int divided_Hund = restOfFiveHund / 100;
                if(divided_Hund>0)
                {
                    for(int i = 0; i<divided_Hund; i++)
                    {
                        result += "C";
                    }
                }

                int restOfHund = restOfFiveHund % 100;
                if(restOfHund>0)
                {
                    result += intToRomanForTwoLength(restOfHund);
                }
            }
        }

        return result;
    }

    // 1000의자리 메소드
    public String intToRomanForFourLength(int num)
    {
        String result = "";
        // 3자리수
        int divided_Thousand = num / 1000;
        int restOfThousand = num % 1000;
        
        if(divided_Thousand > 0)
        {
            for(int i = 0; i<divided_Thousand; i++)
            {
                result += "M";
            }
        }

        if(restOfThousand>0)
        {
            if(restOfThousand >=100)
            {
                result += intToRomanForThreeLength(restOfThousand);
            }
            else if(restOfThousand >=10 && restOfThousand < 100)
            {
                result += intToRomanForTwoLength(restOfThousand);
            }
            else if(restOfThousand >= 1 && restOfThousand < 10)
            {
                result += intToRomanForOneLength(restOfThousand);
            }
        }
        
        return result;
    }
}
