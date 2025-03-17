package CSA.UnitSeven;
import java.util.ArrayList;
public class ListTotal 
{

    public static int total(int [] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }
        int sum = 0;
        for (int j = 0; j < list.size(); j++)
        {
            sum+=list.get(j);
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        System.out.println(total(a1));
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        System.out.println(total(a2));
        int [] a3 = {10,20,30,40,50,-11818,40,30,20,10};
        System.out.println(total(a3));
        int [] a4 = {32767};
        System.out.println(total(a4));
        int [] a5 = {255,255};
        System.out.println(total(a5));
        int [] a6 = {9,10,-88,100,-555,1000};
        System.out.println(total(a6));
        int [] a7 = {10,10,10,11,456};
        System.out.println(total(a7));
        int [] a8 = {-111,1,2,3,9,11,20,30};
        System.out.println(total(a8));
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,-989};
        System.out.println(total(a9));
        int [] a10 = {12,15,18,21,23,1000};
        System.out.println(total(a10));
        int [] a11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
        System.out.println(total(a11));
        int [] a12 = {9,10,-8,10000,-5000,1000};
        System.out.println(total(a12));
    }
    
}
