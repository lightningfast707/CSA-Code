import java.util.Scanner;

public class IfsLab1{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a social security number:");
        String sss = keyboard.next();
        char a = sss.charAt(3);
        char b = sss.charAt(6);
        char c = '-';
        
        if (a == c  && b == c)
        {
            System.out.println(sss.substring(7));
        }
        else
        {
            System.out.println("bad");
        }
    }

}
