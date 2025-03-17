package CSA.UnitSix;
public class MostFrequentRunner 
{
    public static int RayMostFreq(int [] array)
    {
       int max_count = 0;
       int max_num = array[0];
       for (int i = 0; i < array.length; i++)
       {
            int count = 0;
            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                }
            }
            if (count > max_count)
            {
                max_count = count; 
                max_num = array[i];
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
        System.out.println(RayMostFreq(a1));
        System.out.println(RayMostFreq(a2));
        System.out.println(RayMostFreq(a3));
        System.out.println(RayMostFreq(a4));
        System.out.println(RayMostFreq(a5));
        System.out.println(RayMostFreq(a6));
        System.out.println(RayMostFreq(a7));
        System.out.println(RayMostFreq(a8));
        System.out.println(RayMostFreq(a9));
        System.out.println(RayMostFreq(a10));
        System.out.println(RayMostFreq(a11));
        System.out.println(RayMostFreq(a12));
    }
    
}
