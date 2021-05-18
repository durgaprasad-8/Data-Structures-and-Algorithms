// index of last occurrence in sorted array
// iterative process


public class last_occurrence {

    static int b_last(int[] arr, int n, int x)
    {
        int low = 0;
        int high = n-1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

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
                if((mid == n-1) || (arr[mid] != arr[mid+1]))
                {
                    return mid;
                }

                else
                {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
    
    public static void main(String[] args) 
    {
        
        int[] arr = {3, 40, 40, 40, 40, 40, 40, 50};

        int n = arr.length;

        int x = 50;

        System.out.println(b_last(arr, n, x));
    }
}
