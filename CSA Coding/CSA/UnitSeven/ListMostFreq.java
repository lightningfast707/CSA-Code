package CSA.UnitSeven;
import java.util.ArrayList;
public class ListMostFreq 
{
    public static int common(int [] array)
    {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       for (int nums : array)
       {
            list.add(nums);
       }
       int max_count = 0;
       int max_num = list.get(0);
       for (int i = 0; i < list.size(); i++)
       {
            int count = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    count++;
                }
            }
            if (count > max_count)
            {
                max_count = count; 
                max_num = list.get(i);
            }
       }
       return max_num;
       
       
    }
    public static void main(String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        int [] a3 = {10,20,30,40,50,10,10,40,30,20,10};
        int [] a4 = {32767};
        int [] a5 = {255,255};
        int [] a6 = {9,10,-88,100,-555,1000};
        int [] a7 = {10,10,10,11,456,10,10,2,2,2,2,2,2,2};
        int [] a8 = {-111,1,2,3,9,11,20,30};
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,-989};
        int [] a10 = {12,12,15,18,21,23,1000};
        int [] a11 = {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
        int [] a12 = {9,10,-8,10000,-5000,1000};
        System.out.println(common(a1));
        System.out.println(common(a2));
        System.out.println(common(a3));
        System.out.println(common(a4));
        System.out.println(common(a5));
        System.out.println(common(a6));
        System.out.println(common(a7));
        System.out.println(common(a8));
        System.out.println(common(a9));
        System.out.println(common(a10));
        System.out.println(common(a11));
        System.out.println(common(a12));
    }
    
}
