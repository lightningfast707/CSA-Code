import java.util.Arrays;

public class GetFirstRunner 
{
    public static int [] RayGetFirst(int [] array)
    {
        int count = 0;
        int [] output = {};
        if (array.length == 0)
        {
            return output;
        }
        for (int num = 1; num <= array.length-1; num++)
        {
            if (num > array[0])
            {
                output[count] = num;
                count++;
            }
        }
        return output;
    }
    public static String toString(int [] array)
    {
        return Arrays.toString(array);
    }
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
        
        int [] b = RayGetFirst(a1);
        int [] c = RayGetFirst(a2);
        int [] d = RayGetFirst(a3);
        int [] e = RayGetFirst(a4);
        int [] f = RayGetFirst(a5);
        int [] g = RayGetFirst(a6);
        int [] h = RayGetFirst(a7);
        int [] i = RayGetFirst(a8);
        int [] j = RayGetFirst(a9);
        int [] k = RayGetFirst(a10);
        int [] l = RayGetFirst(a11);
        int [] m = RayGetFirst(a12);

        System.out.println(toString(b));
        System.out.println(toString(c));
        System.out.println(toString(d));
        System.out.println(toString(e));
        System.out.println(toString(f));
        System.out.println(toString(g));
        System.out.println(toString(h));
        System.out.println(toString(i));
        System.out.println(toString(j));
        System.out.println(toString(k));
        System.out.println(toString(l));
        System.out.println(toString(m));
    }
}
