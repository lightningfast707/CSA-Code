public class MatrixLarge 
{
    public static int findMax(int [] [] array)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array [i][j] > max)
                {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String [] args)
    {
        int [] [] matrix1 = {{1,2,3},{5,5,5,5}};
        int [] [] matrix2 = {{1,2,3},{-5},{11},{21,2}};
        int [] [] matrix3 = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
        int [] [] matrix4 = {{-20, -40},{-234,-234234 }};

        System.out.println("The biggest number is :: " + findMax(matrix1));
        System.out.println("The biggest number is :: " + findMax(matrix2));
        System.out.println("The biggest number is :: " + findMax(matrix3));
        System.out.println("The biggest number is :: " + findMax(matrix4));




    }
    
}
