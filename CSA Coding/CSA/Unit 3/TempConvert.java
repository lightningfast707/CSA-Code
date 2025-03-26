import java.util.Scanner;
public class TempConvert{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a temprature (in celcius):");
        double temp = keyboard.nextDouble();
        double FtoC = (temp*9/5)+32;
        if (FtoC >= 85)
        {
            System.out.println(String.format("Temprature in Farenheit:%.0f degrees F. It is Hot",FtoC));
        }
        else if (60 <= FtoC && FtoC <= 84)
        {
            System.out.println(String.format("Temprature in Farenheit:%.0f degrees F. It is Moderate",FtoC));
        }
        else {
            if (FtoC < 60){
                
                System.out.println(String.format("Temprature in Farenheit:%.0f degrees F. It is Cold",FtoC));
            }
        }
        

    }
}