

public class binarySearch
{
    static int b_search(int[] arr, int n, int x)
    {
        int low = 0;
        int high = n-1;

        while(low <= high)
        {

            int mid = (low + high)/2;

            if(arr[mid] == x)
            {
                return mid;
            }

            else if(arr[mid] > x)
            {
                high = mid - 1;
            }

            else
            {
                low = mid + 1;
            }
        }

        return -1;
     
    }

    public static void main(String[] args) {
        
        int[] arr = {24, 48, 90, 99, 100, 120};
        int n = arr.length;
        int x = 121;

        System.out.println(b_search(arr, n, x));;
    }
}