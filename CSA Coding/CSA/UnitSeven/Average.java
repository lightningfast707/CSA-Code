package CSA.UnitSeven;
import java.util.ArrayList;
public class Average 
{
    public static double calcAvg(int [] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }
        int max = list.get(0);
        int min = list.get(0);
        for (int j = 1; j < list.size(); j++)
        {
            int number = list.get(j);
            if (number > max)
            {
                max = number;
            }
        }
        for (int k = 1; k < list.size(); k++)
        {
            int number = list.get(k);
            if (number < min)
            {
                min = number;
            }
        }
        return (double) (min+max)/2;
    } 
    public static void main(String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        System.out.println(calcAvg(a1));
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        System.out.println(calcAvg(a2));
        int [] a3 = {10,20,30,40,50,-11818,40,30,20,10};
        System.out.println(calcAvg(a3));
        int [] a4 = {32767};
        System.out.println(calcAvg(a4));
        int [] a5 = {255,255};
        System.out.println(calcAvg(a5));
        int [] a6 = {9,10,-88,100,-555,1000};
        System.out.println(calcAvg(a6));
        int [] a7 = {10,10,10,11,456};
        System.out.println(calcAvg(a7));
        int [] a8 = {-111,1,2,3,9,11,20,30};
        System.out.println(calcAvg(a8));
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,-989};
        System.out.println(calcAvg(a9));
        int [] a10 = {12,15,18,21,23,1000};
        System.out.println(calcAvg(a10));
        int [] a11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
        System.out.println(calcAvg(a11));
        int [] a12 = {9,10,-8,10000,-5000,1000};
        System.out.println(calcAvg(a12));
    }   
}
