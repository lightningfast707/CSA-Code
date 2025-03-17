package CSA.UnitSix;
import java.util.Arrays;

public class Doggies {
    private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
        pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{

		//put a new Dog in the array at spot 
        pups[spot] = new Dog(age, name);
		//make sure spot is in bounds		
        
	}

	public String getNameOfOldest()
	{
        if (pups.length == 0)
        {
            return null;
        }
        Dog max = pups[0];
        for (Dog dogs : pups)
        {
            if (dogs.getAge() > max.getAge())
            {
                max = dogs;
            }
        }
        return max.getName();
	}

	public String getNameOfYoungest()
	{
        if (pups.length == 0)
        {
            return null;
        }
        Dog min = pups[0];
        for (Dog dogs : pups)
        {
            if (dogs.getAge() < min.getAge())
            {
                min = dogs;
            }
        }
        return min.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
