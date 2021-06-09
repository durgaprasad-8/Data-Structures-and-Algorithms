// print sum of n natural numbers

public class natural_num_sum {

    static int print_natural(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return n + print_natural(n - 1);
    }

    public static void main(String[] args) 
    {
        int n = 5;

        // print_natural(n);
        
        System.out.println(print_natural(n));
        
    }
    
}
