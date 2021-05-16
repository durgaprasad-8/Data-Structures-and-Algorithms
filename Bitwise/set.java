// check the kth bit is set or not
// by using left shift

public class set {
    
    public static void kth_bit_set(int n, int k)
    {
        if((n & (1 << (k-1))) != 0)
        // if((n & (1 << (k-1))) == 1)
        // 
        // 
        {
            System.out.println("set");
        }
        else
        {
            System.out.println("not set");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        kth_bit_set(n, k);
    }
}


// minor error