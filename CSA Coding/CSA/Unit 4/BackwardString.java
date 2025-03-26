import java.util.Scanner;
public class BackwardString{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a string:");
        String word = keyboard.next();
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        for (int i = word.length()-1; i >= 0; i--)
        {
            System.out.print(word.charAt(i));
        }   
        System.out.println("");
        System.out.println(word);
    }
}