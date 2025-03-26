package CSA.FRQ;

public class APLine 
{
    private int a;
    private int b;
    private int c;
    
    public APLine(int num1, int num2, int num3)
    {
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }
    public double getSlope()
    {
        return (double) -a/b;
    }
    public boolean isOnLine(int x, int y)
    {
        if ((a*x + b*y + c) == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String [] args)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        System.out.println(slope1);
        boolean onLine1 = line1.isOnLine(5,-2);
        System.out.println(onLine1);
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        System.out.println(slope2);
        boolean onLine2 = line2.isOnLine(5,-2);
        System.out.println(onLine2);
    }
    
}
