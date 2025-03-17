package CSA.UnitSix;
public class SumLastRunner 
{
    public static int RaySumLast(int [] array)
    {
        if (array.length == 0)
        {
            return -1;
        }
        int sum = 0;
        int last = array[array.length-1];
        for (int num : array)
        {
            if(num > last)
            {
                sum+=num;
            }
        }
        if (sum == 0)
        {
            return -1;
        }
        return sum;        

    }
    //testing code
    public static void main(String [] args)
    {
        int [] a1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
        int [] a2 = {10,9,8,7,6,5,4,3,2,1,-99};
        int [] a3 = {10,20,30,40,50,-11818,40,30,20,10};
        int [] a4 = {32767};
        int [] a5 = {255,255};
        int [] a6 = {9,10,-88,100,-555,2};
        int [] a7 = {10,10,10,11,456};
        int [] a8 = {-111,1,2,3,9,11,20,1};
        int [] a9 = {9,8,7,6,5,4,3,2,0,-2,6};
        int [] a10 = {12,15,18,21,23,1000};
        int [] a11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
        int [] a12 = {9,10,-8,10000,-5000,-3000};
        System.out.println(RaySumLast(a1));
        System.out.println(RaySumLast(a2));
        System.out.println(RaySumLast(a3));
        System.out.println(RaySumLast(a4));
        System.out.println(RaySumLast(a5));
        System.out.println(RaySumLast(a6));
        System.out.println(RaySumLast(a7));
        System.out.println(RaySumLast(a8));
        System.out.println(RaySumLast(a9));
        System.out.println(RaySumLast(a10));
        System.out.println(RaySumLast(a11));
        System.out.println(RaySumLast(a12));
    }

}
