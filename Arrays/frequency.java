// print frequency of elements
// efficient process


public class frequency 
{
    static void print_frequency(int arr[])
    {
        int element_frequency = 1;
        int i = 1;

        while(i < arr.length)
        {
            while(i < arr.length && arr[i] == arr[i-1])
            {
                element_frequency++;
                i++;
            }

            System.out.println(arr[i-1]+ " " +element_frequency);

            element_frequency = 1;
            i++;
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {200, 200, 200, 200, 183, 183, 183, 183};
        print_frequency(arr);
        
    }
    
}
