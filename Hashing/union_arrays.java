import java.util.HashSet;

// union of two arrays

public class union_arrays 
{

    static int union(int arr1[], int arr2[], int m, int n)
    {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < m; i++)
        {
            hs.add(arr1[i]);
        }
        for(int i = 0; i < n; i++)
        {
            hs.add(arr2[i]);
        }

        return hs.size();
    }
    
    public static void main(String[] args) 
    {
        int[] arr1 = {24, 24, 78, 97};
        int[] arr2 = {90, 10, 120, 200, 280};

        int m = arr1.length;
        int n = arr2.length;

        System.out.println(union(arr1, arr2, m, n));
        
    }
}
