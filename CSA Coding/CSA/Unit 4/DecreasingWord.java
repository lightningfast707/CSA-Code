import java.util.Scanner;
public class DecreasingWord{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a word:");
        String word  = keyboard.next();
        for (int i = word.length(); i >= 0; i--)
        {
            System.out.println(word.substring(0,i));
        }   
        
    }
}