import java.util.Scanner;

public class GuessingGame2{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int random = (int) (Math.random()*101);
        int guess;
        do{
            System.out.print("Guess a number between 1-100 inclusive: ");
            guess = keyboard.nextInt();
            if (guess > random)
            {
                System.out.println("Too high"); 
            }
            else if (guess < random)
            {
                System.out.println("Too low");
            }
            else
            {
                System.out.println("Correct");
                break;
            }
            
        }while (guess!=random);
        
        
    }
}