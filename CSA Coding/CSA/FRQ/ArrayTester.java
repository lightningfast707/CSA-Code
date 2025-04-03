package CSA.FRQ;

import java.util.Arrays;

public class ArrayTester 
{
    public int [] getColumn(int [] [] array2D, int c)
    {
        int [] result = new int[array2D.length];
        for (int row = 0; row < array2D.length; row++)
        {
            result[row] = array2D[row][c];
        }
        return result;
    }
    public boolean hasAllValues(int [] arr1, int [] arr2)
    {
        for (int value : arr1)
        {
            boolean found = false;
            for (int elment : arr2)
            {
                if (value == elment)
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean containsDuplicates(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void isLatin(int [] [] square)
    {
        int [] firstarr = new int[square[0].length];
        int r = 0;
        for (int col = 0; col < square[r].length; col++)
        {
            firstarr[col] = square[r][col];
        }
        System.out.println(Arrays.toString(firstarr));
        //first row duplicate check
        if (!containsDuplicates(firstarr))
        {
            //column check
            int countcol = 0;
            for (int row = 0; row < square.length; row++)
            {
                if (hasAllValues(firstarr,getColumn(square, row)))
                {
                    countcol++;
                }
            }
            System.out.println(countcol);

            if (countcol == square.length)
            {
                //row check
                int t = 0;
                int countrow = 0;
                for (int row = 0; row < square.length; row++)
                {
                    int [] rowthing = new int[square[0].length];
                    for (int col = 0; col < square[0].length; col++)
                    {
                        rowthing[col] = square[t][col];
                    }
                    if (hasAllValues(firstarr,rowthing))
                    {
                        countrow++;
                    }
                    t++;
                }
                if (countrow == square.length)
                {
                    //return true;
                    System.out.println("True");
                }
            }
        }
        //return false;
        System.out.println("False");
       
    }
    public static void main(String [] args)
    {
        ArrayTester a1 = new ArrayTester();
        int [] [] arr2D = {{0,1,2},{3,4,5},{6,7,8},{9,5,3}};
        System.out.println(Arrays.toString(a1.getColumn(arr2D, 1)));
        //int [] [] secondarr2D = {{1,2,3},{2,3,1},{3,1,2}};
        //System.out.println(a1.isLatin(secondarr2D));
        //a1.isLatin(secondarr2D);
        //int [] [] thirdarr2D = {{10,20,30,0},{0,20,30,10},{30,0,10,20},{20,10,0,30}};
        //System.out.println(Arrays.toString(a1.getColumn(thirdarr2D, 1)));
        //a1.isLatin(thirdarr2D);
        //int [] [] arr = {{1,2,1},{2,1,1},{1,1,2}};
        //a1.isLatin(arr);
        //int [] [] arr2 = {{1,2,3},{3,1,2},{7,8,9}};
        //a1.isLatin(arr2);
        //int [] [] arr3 = {{1,2},{1,2}};
        //a1.isLatin(arr3);

    }
    
}
