
// sieve of erostheness

public class soe {
    
    static void seive(int n)
    {
        if(n <= 1)
        {
            return;
        }

        boolean isprime[] = new boolean[n+1];

        Arrays.fill(isprime, true);

        for(int i = 2; i*i <= n; i++)
        {
            if(isprime[i])
            {
                for(int j = 2*i; j <= n; j = j+i)
                {
                    isprime[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++)
        {
            if(isprime[i])
            {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        
        int n = 9;
        seive(n);
    }
}
