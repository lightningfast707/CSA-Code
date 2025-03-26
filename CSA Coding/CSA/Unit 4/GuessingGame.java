import java.util.Scanner;
import java.lang.Math;

public class GuessingGame
{
    public static void guess ()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Guessing Game - how many numbers?");
        int number = keyboard.nextInt();
        int max = number;
        int min = 1;
        int range = max - min + 1;
        int random = (int) (Math.random()*range) + min;
        int count = 0;
        
        boolean condition = true;
        while (condition)
        { 
            System.out.print("Enter a number bewteen 1 and  " + number + " ");
            int guess = keyboard.nextInt();
            if (guess > number || guess < 1)
            {
                System.out.println("Number out of range!");
            }
            if (guess == random)
            {
                count++;
                System.out.println("It took you " + count + " tries "); 
                double percentwrong = (double) (count-1)/(number)*100;
                String formattedValue = String.format("%.0f", percentwrong);
                System.out.println("You guessed wrong " + formattedValue + " percent of the time.");
                condition = false;
                
            }
            count++;
        }
        
    }
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner (System.in);
        guess();
        while (true){
            System.out.println("Do you want to play again y or n");
            String answer = keyboard.next();
            if (answer.equals("y"))
            {
                guess();
            }
            else
            {
                break;
            }
        }
            
    }
}