import java.util.Scanner;
import java.util.*;

public class LetterRemoval
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a string:");
        String string = keyboard.nextLine();
        System.out.print("Enter the letter to remove:");
        char letter = keyboard.next().charAt(0);
        removal(string,letter);
    }
    public static void removal(String s1, char let)
    {
        StringBuilder str = new StringBuilder(s1);
        int i = 0;
        while (i < str.length())
        {
            if (str.charAt(i) == let)
            {
                str.deleteCharAt(i);
            }
            else
            {
                i++;
            }
        }
        System.out.println(str.toString());
    }
}