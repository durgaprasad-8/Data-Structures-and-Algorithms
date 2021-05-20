public class gcd {

    static int gcd_of(int a, int b)
    {
        while(a != b)
        {
            if(a > b)
            {
                a = a - b;
            }

            else
            {
                b = b - a;
            }
        }

        return b;
        // return a;
    }

    public static void main(String[] args) {
        
        int a = 12;
        int b = 15;

        System.out.println(gcd_of(a, b));
    }
    
}
