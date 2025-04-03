package CSA.FRQ;

public class LightBoard 
{
    private boolean [] [] lights = {{true,true,false,true,true},{true,false,false,true,false},
    {true, false,false,true,true},{true,false,false,false,true},{true,false,false,false,true},
    {true,true,false,true,true},{false,false,false,false,false}};

    public LightBoard(int numRows,int numCols)
    {
        lights = new boolean[numRows][numCols];
        for (int row = 0; row < lights.length; row++)
        {
            for (int col = 0; col < lights[0].length; col++)
            {
                double rand = Math.random();
                lights[row][col] = rand < 0.4;
            }
        }
    }

    public boolean evaluateLight(int row, int col)
    {
        int count = 0;
        if (lights[row][col] == true)
        {  
            for (int r = 0; r < lights.length; r++)
            {
                if (lights[r][col] == true)
                {
                    count++;
                }
            }
            if (count%2 == 0)
            {
                return false;
            }
        }
        else if (lights[row][col] == false)
        {
            for (int i = 0; i < lights.length; i++)
            {
                if (lights[i][col] == true)
                {
                    count++;
                }
            }
            if (count%3 == 0)
            {
                return true;
            }
        }
        return lights[row][col];

    }
    public static void main(String [] args)
    {
        LightBoard l1 = new LightBoard(7,5);
        System.out.println(l1.evaluateLight(0, 3));
        System.out.println(l1.evaluateLight(6, 0));
        System.out.println(l1.evaluateLight(4, 1));
        System.out.println(l1.evaluateLight(5, 4));
        //l1.evaluateLight(0, 3);
        //l1.evaluateLight(6, 0);
        //l1.evaluateLight(4, 1);
        //l1.evaluateLight(5, 4);


    }
    
}
