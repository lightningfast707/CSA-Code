import java.util.Scanner;

public class ReverseCounting
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        
        int i = number;
        while (i >= 1)
        {
            System.out.println(i);
            i--;
        }
    }
}