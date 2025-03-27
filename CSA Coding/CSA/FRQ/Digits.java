package CSA.FRQ;

import java.util.ArrayList;

public class Digits 
{
    private ArrayList<Integer> digitList = new ArrayList<>();

    public Digits(int num)
    {
        String number = Integer.toString(num);
        for (int i = 0; i < number.length(); i++)
        {
            digitList.add(Integer.parseInt(Character.toString(number.charAt(i))));
        }
        System.out.println(digitList);
    }
    public boolean isStrictlyIncreasing()
    {
       boolean increase = false;
       if (digitList.size() == 1)
       {
          return true;
       }
       for (int i = 1; i < digitList.size()-1; i++)
       {
          if (digitList.get(i) > digitList.get(i-1) && digitList.get(i) != digitList.get(i+1))
          {
            increase = true;
          }
          else
          {
            increase = false;
            break;
          }
       }
       return increase;
    }
    public static void main(String [] args)
    {
        Digits d1 = new Digits(65310);
        System.out.println(d1.isStrictlyIncreasing());
        
    }
    
}
