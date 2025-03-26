import java.util.Scanner;

public class NaturalNumberSum
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        
        int i = 0;
        int sum = 0;
        while (i <= number)
        {
            sum +=i;
            i++;
        }
        System.out.println("The total is: " + sum);
    }
}