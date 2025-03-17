package CSA.UnitSeven;
import java.util.ArrayList;

public class ListGetNums 
{ 
    public static ArrayList<Integer> findnums(int [] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }
        int count = 0;
        ArrayList<Integer> greatthree = new ArrayList<Integer>();
        for (int num : list)
        {
            if (count < 3 && num > 11)
            {
                greatthree.add(num);
                count++;
            }
        }
        return greatthree;             
    }
    
    public static void main(String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        int [] a3 = {10,20,30,40,50,-11818,40,30,20,10};
        int [] a4 = {32767};
        int [] a5 = {255,255};
        int [] a6 = {9,10,-88,100,-555,1000};
        int [] a7 = {10,10,10,11,456};
        int [] a8 = {-111,1,2,3,9,11,20,30};
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,-989};
        int [] a10 = {12,15,18,21,23,1000};
        int [] a11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
        int [] a12 = {9,10,-8,10000,-5000,1000};
        
        System.out.println(findnums(a1));
        System.out.println(findnums(a2));
        System.out.println(findnums(a3));
        System.out.println(findnums(a4));
        System.out.println(findnums(a5));
        System.out.println(findnums(a6));
        System.out.println(findnums(a7));
        System.out.println(findnums(a8));
        System.out.println(findnums(a9));
        System.out.println(findnums(a10));
        System.out.println(findnums(a11));
        System.out.println(findnums(a12));
        
    } 
    
}
