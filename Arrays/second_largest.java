// find the indes of second largest element
// efficient process

public class second_largest 
{
    static int second_largest_index(int[] arr)
    {
        int result = -1;
        int largest = 0;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > arr[largest])
            {
                result = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest])
            {
                if(result == -1 || arr[i] > arr[result])
                {
                    result = i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {186, 183, 200, 175, 148, 150, 264};

        System.out.println(second_largest_index(arr));
    }
    
}
