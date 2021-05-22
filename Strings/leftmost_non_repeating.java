// return the index of left most non repeating charecter

public class leftmost_non_repeating {

    static final int CHAR = 256;

    static int non_repeating(String s1)
    {

        int[] count = new int[CHAR];

        for(int i = 0; i < s1.length(); i++)
        {
            count[s1.charAt(i)]++;
        }

        for(int i = 0; i < s1.length(); i++)
        {
            if(count[s1.charAt(i)] == 1)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        String s1 = "aabbccddeef";

        System.out.println("Index of left most non repeating charecter");

        System.out.println(non_repeating(s1));
    }
    
}
