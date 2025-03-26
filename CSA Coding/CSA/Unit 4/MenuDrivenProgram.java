import java.util.Scanner;
public class MenuDrivenProgram
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int option;
        System.out.println("1.Display a message");
        System.out.println("2.Perform a simple calculation");
        System.out.println("3.Exit");
        do
        {
            System.out.print("Choose an option (1,2,3)" + " ");
            option = keyboard.nextInt();
            if (option == 1)
            {
                System.out.print("Enter message to display" + " ");
                String message = keyboard.next();
                System.out.println(message);
            }

            else if (option == 2)
            {
                System.out.print("Enter the first number you want to add" + " ");
                int a = keyboard.nextInt();
                System.out.print("Enter the second number you want to add" + " ");
                int b = keyboard.nextInt();
                int c = a+b;
                System.out.println(a+" + "+ b + " = " + c);
            }

            else
            {
                break;
            }
        }while(option!= 3);

    }
}