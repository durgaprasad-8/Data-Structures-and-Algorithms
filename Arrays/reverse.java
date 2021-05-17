// reverse an array
// swap the variables

public class reverse {

    static void reverse_an_array(int[] arr, int n)
    {
        int low = 0;
        int high = n-1;

        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
    
            low++;
            high--;

        }

       
    }

    public static void main(String[] args) 
    {
        
        int[] arr = {23, 32, 4, 67, 40};
        int n = arr.length;

        System.out.println("before reverse");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println();


        reverse_an_array(arr, n);
        

        System.out.println("after reverse");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
    
}
