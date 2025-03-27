package CSA.FRQ;

import java.util.Arrays;

public class SelfDivisor 
{
    public static boolean isSelfDivisor(int number)
    {
        String s = Integer.toString(number);
        int count = 0;
        if (s.contains("0"))
        {
            return false;
        }
        for (int i = 0; i < s.length(); i++)
        {
            int n = Integer.parseInt(Character.toString(s.charAt(i)));
            if (number%n == 0)
            {
                count++;
            }
        }
        if (count == s.length())
        {
            return true;
        }
        return false;
    }
    public static int [] firstNumSelfDivisors(int start, int num)
    {
        int i = 0;
        int [] arr = new int[num];
        while (i < num)
        {
            if(isSelfDivisor(start))
            {
                arr[i] = start;
                i++;
            }
            start++;
        }
        return arr;
    }
    public static void main(String [] args)
    {
        SelfDivisor s1 = new SelfDivisor();
        System.out.println(s1.isSelfDivisor(128));
        System.out.println(Arrays.toString(s1.firstNumSelfDivisors(10, 3)));
        System.out.println(s1.isSelfDivisor(13));
    }
    
}
