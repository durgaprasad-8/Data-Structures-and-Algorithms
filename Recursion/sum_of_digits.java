public class sum_of_digits {

    static int print_sum_digits(int n)
    {
        if(n < 10)
        {
            return n;
        }

        return print_sum_digits(n /10) + (n % 10);
    }

    public static void main(String[] args) 
    {
        int n = 183;

        System.out.println(print_sum_digits(n));
        
    }
    
}
