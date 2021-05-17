

// index of first occurence in an array
// effcient process

public class first_occurrence {
    
    static int b_first(int[] arr, int n, int x)
    {
        int low = 0;
        int high = n-1;

        while(low <= high)
        {

            int mid = (low + high)/2;

            if(arr[mid] > x)
            {
                high = mid - 1;
            }

            else if(arr[mid] < x)
            {
                low = mid + 1;
            }

            else
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }

                else
                {
                    high = mid - 1;
                }
            }

        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 32};
        int n = arr.length;
        int x = 32;

        System.out.println(b_first(arr, n, x));
    }
}
