// remove copy elements and return the size of an array
// efficient process

public class remove_copy 
{
    static int remove_duplicate_elements(int arr[])
    {
        int result = 0;
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] != arr[result])
            {
                // arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int arr[] = {007, 200, 200, 007, 200};

        System.out.println(remove_duplicate_elements(arr));
    }
    
}
