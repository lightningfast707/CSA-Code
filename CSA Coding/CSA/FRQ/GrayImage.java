package CSA.FRQ;

import java.util.Arrays;

public class GrayImage 
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int [] [] pixelValues = {{221,184,178,84,135},{84,255,255,130,84},{78,255,0,0,78},
    {84,130,255,130,84}};
    
    public int countWhitePixels()
    {
        int count = 0;
        for (int row = 0; row < pixelValues.length; row++)
        {
            for (int col = 0; col < pixelValues[0].length; col++)
            {
                if (pixelValues[row][col] == WHITE)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public void processImage()
    {
        for (int row = 0; row < pixelValues.length; row++)
        {
            for (int col = 0; col < pixelValues[0].length; col++)
            {
                int current = pixelValues[row][col];
                if (row+2 < pixelValues.length && col+2 < pixelValues[0].length)
                {
                    int replace = pixelValues[row+2][col+2];
                    pixelValues[row][col] = current - replace;
                    if ((current - replace) < BLACK)
                    {   
                        pixelValues[row][col] = BLACK;
                    }
                }   
            }   
        }
        System.out.println(Arrays.deepToString(pixelValues));
    }
    public static void main(String [] args)
    {
        GrayImage g1 = new GrayImage();
        System.out.println(g1.countWhitePixels());
        g1.processImage();
    }
    
}
