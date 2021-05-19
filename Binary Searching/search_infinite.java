//  search an element in infinite sized array

public class search_infinite
{

    static int binary_search_seven(int[] arr, int low, int high, int x)
    {
        if(low > high)
        {
            return -1;
        }

        int mid = (low + high)/2;

        if(arr[mid] == x)
        {
            return mid;
        }

        else if(arr[mid] > x)
        {
            return binary_search_seven(arr, low, mid-1, x);
        }

        else 
        {
            return binary_search_seven(arr, mid+1, high, x);
        }
    }

    static int search_in_infinite(int[] arr, int x)
    {
        if(arr[0] == x)
        {
            return 0;

        }

        int i = 1;

        while(arr[i] < x)
        {
            i = i*2;
        }

        if(arr[i] == x)
        {
            return i;
        }

        else
        {
            return binary_search_seven(arr, i / 2 + 1, i-1, x);
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {24, 87, 90, 123, 500, 609, 765, 879, 918};
        int x = 609;

        System.out.println(search_in_infinite(arr, x));
    }
}

