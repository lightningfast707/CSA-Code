package CSA.UnitSix;
import java.util.Scanner;

public class DoggiesRunner {
    public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for(int i=0; i<size;i++)
		{
			//read in age and name of the dog
            System.out.print("Age of dog :: ");
            String name = keyboard.next();
            System.out.print("Name of dog  :: ");
            int age = keyboard.nextInt();
            //call the method to add a new dog to the pack
            pack.set(i, age, name);
			
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());		
	}		
    
}
