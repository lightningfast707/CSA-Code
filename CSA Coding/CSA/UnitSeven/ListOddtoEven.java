package CSA.UnitSeven;
import java.util.ArrayList;
public class ListOddtoEven 
{
    public static int oddEven(int [] array)
    {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
        }
        int indexodd = -1;
        for (int num = 0; num < list.size(); num++)
        {
            int number = list.get(num);
            if (number%2 != 0)
            {
                indexodd = num;
                break;
            }
        }
        if (indexodd == -1)
        {
            return -1;
        }
        int indexeven = -1;
        for (int i = list.size() - 1; i >= indexodd; i--)
        {
            int number = list.get(i);
            if (number % 2 == 0){
                indexeven = i;
                break;
            }
        }
        if (indexeven == -1){
            return -1;
        }
        return indexeven - indexodd;
    } 
    public static void main(String [] args)
    {
        int [] a1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
        int [] a2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
        int [] a3 = {10,20,30,40,5,41,31,20,11,7};
        int [] a4 = {32767,70,4,5,6,7};
        int [] a5 = {2,7,11,21,5,7};
        int [] a6 = {7,255,11,255,100,3,2};
        int [] a7 = {9,11,11,11,7,1000,3};
        int [] a8 = {7,7,7,11,2,7,7,11,11,2};
        int [] a9 = {2,4,6,8,8};
        
        System.out.println(oddEven(a1));
        System.out.println(oddEven(a2));
        System.out.println(oddEven(a3));
        System.out.println(oddEven(a4));
        System.out.println(oddEven(a5));
        System.out.println(oddEven(a6));
        System.out.println(oddEven(a7));
        System.out.println(oddEven(a8));
        System.out.println(oddEven(a9));
    
    }
}

