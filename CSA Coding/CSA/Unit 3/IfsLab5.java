import java.util.Scanner;

public class IfsLab5 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a character:");
        char c = keyboard.next().charAt(0);
        
        if (Character.isDigit(c) == true)
        {
            int ascii = c;
            System.out.println(c + " is a number. " + "ASCII = " + ascii);
        }

        else if (c == Character.toUpperCase(c))
        {
            int ascii2 = c;
            System.out.println(c + " is a uppercase character. " + "ASCII = " + ascii2);
        }

        else
        {
            int ascii3 = c;
            System.out.println(c + " is a lowercase character. " + "ASCII = " + ascii3);
        }
    }
}