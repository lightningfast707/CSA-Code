package CSA.UnitSix;
import java.util.Arrays;

public class Fibonnacci 
{
    private int [] Fib;
    public Fibonnacci(int size)
    {
        Fib = new int[size];
    }
    public String generateFib()
    {
        Fib[0] = 1;
        Fib[1] = 1;
        for (int i = 2; i < Fib.length; i++)
        {
            Fib[i] = Fib[i-1] + Fib[i-2]; 
        }
        return toString(Fib);
    }
    public int FibNumber(int index)
    {
        if (index < 0)
        {
            return -1;
        }
        return Fib[index-1];
    }
    public String toString(int [] array)
    {
        return Arrays.toString(array);
    }
    public static void main(String [] args)
    {
        //create new Fibonnacci Sequence > 0
        Fibonnacci f1 = new Fibonnacci(50);
        f1.generateFib();
        System.out.println(f1.FibNumber(1));
        System.out.println(f1.FibNumber(2));
        System.out.println(f1.FibNumber(3));
        System.out.println(f1.FibNumber(4));
        System.out.println(f1.FibNumber(5));
        System.out.println(f1.FibNumber(6));
        System.out.println(f1.FibNumber(11));
        System.out.println(f1.FibNumber(16));	
        System.out.println(f1.FibNumber(21));
        System.out.println(f1.FibNumber(31));	
        System.out.println(f1.FibNumber(41));			
        System.out.println(f1.FibNumber(46));

        Fibonnacci f2 = new Fibonnacci(1);
        System.out.println(f2.FibNumber(1));
        Fibonnacci f3 = new Fibonnacci(2);
        System.out.println(f3.FibNumber(1));
        System.out.println(f3.FibNumber(2));
        System.out.println(f3.FibNumber(11));

    }
    
}
