// print numbers from n to one

public class n_to_one {

    static void print_n_one(int n)
    {
        if(n == 0)
        {
            return;
        }
        
        System.out.println(n);

        print_n_one(n - 1);

        
    }
    
    public static void main(String[] args) 
    {
        int n = 10;

        print_n_one(n);
        
    }
}
