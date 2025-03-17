package CSA.UnitFive;

public class CookieJar 
{
    private int capacity;
    private int amount;
    private int space;

    public CookieJar(int c)
    {
        capacity = c;
        amount = 0;
        space = capacity-amount;
    }
    public int addStuff(int a)
    {
        if (a > space)
        {
            amount += space;
            return a - space;
        }
        else
        {
            amount += a;
            return amount-capacity;
        }
    }
    public int spaceLeft()
    {
        space = capacity-amount;
        return space;
    }
    public boolean isFull()
    {
        if (space == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String [] args)
    {
        CookieJar c = new CookieJar( 3000 );		
        System.out.println( c.isFull( ) );				
        c.addStuff( 500 );						
                                            
        System.out.println( c.isFull( ) );				
        System.out.println( c.addStuff( 2000 ) );			

        System.out.println( c.spaceLeft( ) );			
        System.out.println( c.isFull( ) );				

        System.out.println( c.addStuff( 2000 ) );			

        System.out.println( c.spaceLeft( ) );		
        System.out.println( c.isFull( ) );				

    }
    
}
