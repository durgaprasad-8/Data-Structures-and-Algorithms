
public class palindrome {
    
    static boolean check_palindrome(String str)
    {
        int begin = 0;
        int end = str.length()-1;

        while(begin < end)
        {
            if(str.charAt(begin) != str.charAt(end))
            {
                return false;
            }

            begin++;
            end--;
        }

        return true;

    }

    public static void main(String[] args) 
    {
        String str = "bringmethanos";
        // check_palindrome(str);
        System.out.println(check_palindrome(str));

    }
}
