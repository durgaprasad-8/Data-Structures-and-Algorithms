public class palindrome
{

    static boolean check_palindrome(int n)
    {

        int reverse = 0;
        int temp = n;

        while(temp != 0)
        {

            int last_digit = temp % 10;
            reverse = reverse * 10 + last_digit;
            temp = temp / 10;
        }

        return (reverse == n);
    }

    public static void main(String[] args) 
    {
        
        int n = 7999;

        // check_palindrome(n);
        System.out.println(check_palindrome(n));
    }
}