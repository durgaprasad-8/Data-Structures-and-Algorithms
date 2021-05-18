// count ones in sorted binary array

public class ones_binary {

    static int binary_sorted_array_count_ones(int[] arr, int n)
    {
        
        int low = 0;
        int high = n-1;

        int mid = (low + high) / 2;

        while(low <= high)
        {
            if(arr[mid] == 0)
            {
                low = mid + 1;
            }

            else
            {
                // if(arr[mid - 1] == 0)

                if(mid == 0 || arr[mid - 1] == 0)
                {
                    return (n - mid);
                }

                else
                {
                    high = mid - 1;
                }
            }
        }

        return 0;
    }
    
    public static void main(String[] args) 
    {

        int[] arr = {0, 0, 1, 1, 1, 1, 1};
        int n = arr.length;
        // int x = 1;

        System.out.println(binary_sorted_array_count_ones(arr, n));
        
    }
}
