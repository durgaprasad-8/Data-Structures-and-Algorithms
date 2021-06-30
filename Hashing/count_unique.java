import java.util.HashSet;

// count unique elements

public class count_unique {

    static int count_unique_elements(int[] arr, int n)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            hs.add(arr[i]);
        }

        return hs.size();
    }

    public static void main(String[] args) {
        
        int[] arr = {24, 24, 50, 70, 80};
        int n = arr.length;

        System.out.println(count_unique_elements(arr, n));
    }
    
}
