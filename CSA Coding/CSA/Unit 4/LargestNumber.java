import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Input (enter -1 to stop):");
        int input = keyboard.nextInt();
        boolean condition = true;
        int maximum = 0;
        while (condition)
        {
            int i = keyboard.nextInt();
            if (input > maximum)
            {
                maximum = input;
            }
            if (input == -1)
            {
                condition = false;
                break;
            }
        }
        System.out.println("The largest number is " + maximum);
    }
}