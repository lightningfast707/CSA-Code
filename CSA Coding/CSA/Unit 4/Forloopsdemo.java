import java.util.Scanner;
public class Forloopsdemo{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the start number:");
        int start  = keyboard.nextInt();
        System.out.print("Enter the end number:");
        int end = keyboard.nextInt();
        System.out.print("Enter the increment number:");
        int increment = keyboard.nextInt();
        for (int i = start; i < end; i+=increment)
        {
            System.out.print(i + " " );
        }   
        
    }
}