// count occurrence of an element in an array
// use first occurrence and last occurence method
// last_Occurrence - first_Occurrence + 1


public class count_occurrence {

    static int first_Occurrence_(int[] arr, int n, int x)
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


    static int last_Occurrence_(int[] arr, int n, int x)
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

    static int c_occurrence(int[] arr, int n, int x)
    {
        int first = first_Occurrence_(arr, n, x);

        if(first == -1)
        {
            return -1;
        }

        else
        {
            return last_Occurrence_(arr, n, x) - first + 1;
        }
    }

    public static void main(String[] args) 
    {

        int [] arr = {10, 10, 20, 20, 20, 20, 40};
        int n = arr.length;
        int x = 90;

        System.out.println(c_occurrence(arr, n, x));

    }

}
