import java.util.Scanner;

public class IfsLab2{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = keyboard.next();
        System.out.print("Which group of words would you like to check:");
        String group = keyboard.next();
        int c = group.length();
        String d = word.substring(word.length()-group.length());
        boolean a = true;
        boolean b = false;
        
        if (word.length() % 2 == 0)
        {
            System.out.println(a);
        }
        else 
        {
            System.out.println(b);
        }
        
        if (word.charAt(0) == word.charAt(word.length()-1))
        {
            System.out.println(a);
        }
        
        else
        {
            System.out.println(b);
        }

        if (group.equals(d))
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}