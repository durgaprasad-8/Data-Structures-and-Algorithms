// find largest element in an array
// efficient process

public class largestElement
{
    static int get_largest_element(int[] array)
    {

        int result = arr[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > array[result])
            {
                result = i;
            } 
        }

        return result;
       
    }
    

    public static void main(String[] args) {
        int[] array =  {23, 3, 78, 87, 8, 50};
        // int n = array.length;

        System.out.println(get_largest_element(array));
    }
}
