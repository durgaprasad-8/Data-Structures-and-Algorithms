// majority element in an array
// if a number appear more than n/2 times, then it is majority element
// naive process

public class majority {

    static int find_majority_element(int[] array, int n)
    {

        for(int i = 0; i < n; i++)
        {
            int count = 1;
            
            for(int j = i+1; j < n; j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                }
            }
            if(count > n/2)
            {
                return i;
            }
        }

        return -1;

        
    }

    public static void main(String[] args)
     {
        int[] array = {12, 32, 32, 32, 32, 32, 9, 90};
        // int n = 8;
        int n = array.length;

        System.out.println(find_majority_element(array, n));
    }
    


}
