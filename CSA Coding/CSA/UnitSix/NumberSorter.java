package CSA.UnitSix;
import java.util.Arrays;

public class NumberSorter {
    private int [] numbers;
    private int count;
    private int originalnum;
    public NumberSorter(int nums)
    {
        originalnum = nums;
        count = 0;
        while (nums > 0)
        {
            count++;
            nums = nums/10;
        }
        numbers = new int[count];
        choptosort(originalnum);
    }
    public void choptosort(int n)
    {
        int t = 0;
        while (n > 0 & t < numbers.length)
        {
            numbers[t] = n%10;
            n = n/10;
            t++;
        }
        sort(numbers);
        System.out.println(toString(numbers));
    }
    public String toString(int [] array)
    {
        return Arrays.toString(array);
    }
    public static void sort(int [] arr)
    {
        Arrays.sort(arr);
    }
    

    public static void main(String [] args)
    {
       NumberSorter n1 = new NumberSorter(567891);
       NumberSorter n2 = new NumberSorter(901912468);
       NumberSorter n3 = new NumberSorter(864213507);
       NumberSorter n4 = new NumberSorter(898777);
       NumberSorter n5 = new NumberSorter(234422);
    }
    
    
}
