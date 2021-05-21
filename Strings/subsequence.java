// check the string is sub-sequence of the original string

public class subsequence {
    
    static boolean check_subsequence(String s1, String s2, int n, int m)
    {
        
        int j = 0;

        for(int i = 0; i < n && j < m; i++)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                j++;
            }
        }

        return ( m == j);
    }

    public static void main(String[] args) 
    {
        String s1 = "aaabcaba";
        String s2 = "ca";

        int n = s1.length();
        int m = s2.length();

        System.out.println(check_subsequence(s1, s2, n, m));
    }
}
