import java.util.Scanner;

public class FactorialCalc
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        
        int i = 1;
        int product = 1;
        while (i <= number)
        {
            product *=i;
            i++;
        }
        System.out.println("The total is: " + product);
    }
}