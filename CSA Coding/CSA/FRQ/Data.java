package CSA.FRQ;

import java.util.Arrays;

import java.util.Random;

public class Data 
{
    public static final int MAX = 50;
    private int [] [] grid = {{10,50,40},{20,40,20},{30,50,30}};
    //private int [] [] grid = {{10,540,440,440},{220,450,440,190}};
    
    public void repopulate()
    {
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                Random rand = new Random();
                int rand1 = rand.nextInt((MAX-1) + 1) + 1;
                while(rand1%10 != 0 || rand1%100 == 0)
                {
                    rand1 = rand.nextInt((MAX-1) + 1) + 1;
                }
                grid[row][col] = rand1;
            }

        }
        System.out.println(Arrays.deepToString(grid));
    }

    public int countIncreasingCols()
    {
        int count = 0;
        for (int col = 0; col < grid[0].length; col++)
        {
            boolean found = true;
            for (int row = 0; row < grid.length-1; row++)
            {
                if (grid[row][col] > grid[row+1][col])
                {
                    found = false;
                }
            }
            if (found)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        Data d1 = new Data();
        System.out.println(d1.countIncreasingCols());
        //d1.countIncreasingCols();
        d1.repopulate();
    }
    
}
