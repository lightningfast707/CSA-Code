package CSA.UnitSix;
public class FirstRunner 
{
    public static boolean RayFirst(int [] array)
    {
        if (array.length == 0)
        {
            return false;
        }
        int first = array[0];
        boolean found = false;
        for (int num = 1; num < array.length; num++)
        {
            if (array[num] == first)
            {
                found = true;
            }
        }
        if (found == false)
        {
            return false;
        }
        return found;
    }
    public static void main (String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        int [] a3 = {10,20,30,40,50,-11818,40,30,20,10};
        int [] a4 = {32767};
        int [] a5 = {7,7,7,7};
        int [] a6 = {9,10,-88,100,-555,1000};
        int [] a7 = {10,10,10,11,456};
        int [] a8 = {-111,1,2,3,9,11,20,30};
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,9,9};
        int [] a10 = {12,15,18,21,23,1000};
        int [] a11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
        int [] a12 = {};
        System.out.println(RayFirst(a1));
        System.out.println(RayFirst(a2));
        System.out.println(RayFirst(a3));
        System.out.println(RayFirst(a4));
        System.out.println(RayFirst(a5));
        System.out.println(RayFirst(a6));
        System.out.println(RayFirst(a7));
        System.out.println(RayFirst(a8));
        System.out.println(RayFirst(a9));
        System.out.println(RayFirst(a10));
        System.out.println(RayFirst(a11));
        System.out.println(RayFirst(a12));

    }
    
}
