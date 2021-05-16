public class power_of_two {
    
    static boolean is_pow_two(int n)
    {
        return ((n != 0) && (n &(n-1)) == 0);
    }

    public static void main(String[] args) {
        int n = 1024;
        System.out.println(is_pow_two(n));
    }
}
