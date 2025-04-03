package CSA.FRQ;

public class TempratureGrid 
{
    private double [] [] temps = {{95.5,100.0,100.0,100.0,100.0,110.0},{0.0,50.0,50.0,50.0,50.0,0.0},
    {0.0,40.0,40.0,40.0,40.0,0.0},{0.0,20.0,20.0,20.0,20.0,0.0},{0.0,0.0,0.0,0.0,0.0}};

    private double computeTemp(int row, int col)
    {
        double temprature = temps[row][col];
        double average = 0; 
        if (row == 0 || col == 0 || row == (temps.length-1) || col == (temps[0].length-1))
        {
            return temprature;
        }
        else
        {
            average += (temps[row-1][col-1]+temps[row][col-1]+temps[row+1][col]+temps[row][col+1])/4.0;
        }
        return average;
    }
    
    public boolean updateAllTemps(double tolerance)
    {
        double [] [] newarray = new double [temps.length][temps[0].length];
        boolean inrange = false;
        for (int row = 0; row < temps.length; row++)
        {
            for (int col = 0; col < temps[0].length; col++)
            {   
                double oldtemp = temps[row][col];
                double newtemp = computeTemp(row, col);
                newarray[row][col] = newtemp;
                if (Math.abs(oldtemp-newtemp) > tolerance)
                {
                    inrange = true;
                }
            }
        }
        return inrange;
        
    }
    
    public static void main(String [] args)
    {
        TempratureGrid t1 = new TempratureGrid();
        /*
        System.out.println(t1.computeTemp(2, 3));
        System.out.println(t1.computeTemp(1, 1));
        System.out.println(t1.computeTemp(0, 2));
        System.out.println(t1.computeTemp(1, 3));
        */
        
        System.out.println(t1.updateAllTemps(0.01));
    }
    
}
