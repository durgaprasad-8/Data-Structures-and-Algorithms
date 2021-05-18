public class left_rotate {

    static void l_rotate_by_one(int[] arr, int n)
    {
        int temp = arr[0];

        for(int i = 1; i < n; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    }

    public static void main(String[] args) 
    {
        int[] arr = {3, 89, 97, 121, 182};
        int n = arr.length;

        System.out.println("before roatation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        System.out.println("after rotation");

        l_rotate_by_one(arr, n);

        for(int i = 0; i < n; i++)
        {
            System.err.print(arr[i]+ " ");
        }
        
    }
    
}
