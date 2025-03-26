import java.util.Scanner;
public class PasswordChecking{
    public static void main (String [] args)
    {
        String y = "mchammergohammer";
        String x = "";
        Scanner keyboard = new Scanner (System.in);
        do{
            System.out.print("Enter the passowrd :: ");
            x = keyboard.next();
            if (x.equals(y))
            {
                System.out.println("Valid"); 
                break;
            }
            System.out.println("Invalid");
            
        }while (x!=y);
        
        
    }
}