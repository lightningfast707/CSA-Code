package CSA.UnitFive;

public class Car 
{
    private int miles;
    private int changeoil;
    public Car (int m,int c)
    {
        miles = m;
        changeoil = c;
    }
    public boolean timeForOilChange()
    {
        if (miles > changeoil)
        {
            miles = 0;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void addMiles(int moremiles)
    {
        miles = moremiles + miles;
    }
    public static void main(String [] args)
    {
        Car c = new Car( 9000, 3000 );	      

        System.out.println( c.timeForOilChange( ) );	

        c.addMiles( 2000 );					

        System.out.println( c.timeForOilChange( ) );	

        c.addMiles( 2000 );					

        System.out.println( c.timeForOilChange( ) );	

    }
}
