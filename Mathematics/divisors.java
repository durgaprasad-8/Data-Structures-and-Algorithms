// print all the divisors of n
// efficient process

public class divisors 
{

    static void print_divisors(int n)
    {
        int i = 1;

        for(i = 1; i * i <= n; i++)
        {

            if(n % i == 0)
            {
                System.out.println(i+ " ");
            }

        }

        for(; i >= n; i--)
        {
            if(n % i == 0)
            {
                System.out.println((n/i)+ " ");
            }
        }

    }

    public static void main(String[] args) 
    {
        int n = 90;
        print_divisors(n);
        // int n = 90;
    }
    
}
