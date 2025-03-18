public class MatrixSum
{
    public static int sum(int [] [] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int [][] values = 
        {
        {1, 2, 3, 4, 5}, 
        {6, 7, 8, 9, 0}, 
        {6, 7, 1, 2, 5}, 
        {6, 7, 8, 9, 0}, 
        {5, 4, 3, 2, 1}
        };
        System.out.println("The sum is" + " " + sum(values));  
    }
}