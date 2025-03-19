public class MatrixCount 
{
    public static int count (int [] [] array, int value)
    {
        int count = 0;
        for (int i = 0; i < array.length; i ++)
        {
            for (int j = 0; j < array.length; j ++)
            {
                int number = array[i][j];
                if (number == value)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        int [][] matrix = 
        {
        {1, 2, 3, 4, 5}, 
        {6, 7, 8, 9, 0}, 
        {6, 7, 1, 2, 5}, 
        {6, 7, 8, 9, 0}, 
        {5, 4, 3, 2, 1}
        };
        int val1 = 7;
        int val2 = 8;
        int val3 = 6;
        int val4 = 21;
        System.out.println("The " + val1 + " count is :: " + count(matrix,val1));
        System.out.println("The " + val2 + " count is :: " + count(matrix,val2));
        System.out.println("The " + val3 + " count is :: " + count(matrix,val3));
        System.out.println("The " + val4 + " count is :: " + count(matrix,val4));
    }
    
}
