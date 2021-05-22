// maximum sum subarray
// efficient process

public class max_sum_subArray {

    // static int maximum_sum(int[] arr, int n)
    static int maximum_sum(int[] arr)
    {
        int result = arr[0];
        int maximum_ending = arr[0];

        for(int i = 1; i < arr.length; i++)
        {

            maximum_ending = Math.max((arr[i - 1] + arr[i]), arr[i]);

            result = Math.max(maximum_ending, result);
        }

        return result;
    }

    public static void main(String[] args) 
    {

        int[] arr = {23, 32, -9, 19};
        // int n = arr.length;

        // System.err.println(maximum_sum(arr, n));
        System.out.println(maximum_sum(arr));
    }
    
}
