// print numbers from one to n

public class one_to_n 
{
    static void print_one_n(int n)
    {
        if(n == 0)
        {
            return;
        }

        print_one_n(n - 1);

        System.out.println(n);

    }

    public static void main(String[] args) 
    {

        int n = 10;

        print_one_n(n);
    }
    
}
