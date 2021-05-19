

// print the multidimensional array in snake pattern

public class snake
{
    static int r = 4, c = 4;

    static void snake_pattern(int matrix[][])
    {
        for(int i = 0; i < r; i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0; j < c; j++)
                {
                    System.out.print(matrix[i][j]+ " ");
                }
            }

            else
            {
                for(int j = c - 1; j >= 0; j--)
                {
                    System.out.print(matrix[i][j]+ " ");
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        int matrix[][] = {{1, 2, 3, 4},
                            {24, 25, 26, 27},
                            {55, 56, 57, 58},
                            {80, 90, 100, 120}};

        snake_pattern(matrix);
        

    }
}