// left most repeating charecter


public class leftmost_repeating {
    
    static final int CHAR = 256;

    static int left_repeating_charecter(String s1)
    {
        int[] count = new int[CHAR];

        for(int i = 0; i < s1.length(); i++)
        {
            count[s1.charAt(i)]++;
        }

        for(int i = 0; i < s1.length(); i++)
        {
            if(count[s1.charAt(i)] > 1)
            {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        
        String s1 = "abcdee";

        System.out.println("index of left most repeating character ");
        System.out.println(left_repeating_charecter(s1));
    }
}
