public class palindrome {

    static boolean is_palindrome(String s, int start, int end)
    {
        if(start >= end)
        {
            return true;
        }

        return ((s.charAt(start) == (s.charAt(end)) )) && (is_palindrome(s, start + 1, end -1 ));
    }

    public static void main(String[] args) 
    {

        String s = "TENET";

        System.out.println(is_palindrome(s, 0, s.length() - 1 ));

        
    }
    
}
