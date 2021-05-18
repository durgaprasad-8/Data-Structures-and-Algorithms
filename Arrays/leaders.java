import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

// prints leaders from left to right
// efficient process

public class leaders {

    static void leaders_in_an_array(int[] arr, int n)
    {
        int current_leader = arr[n-1];
        System.out.print(current_leader+ " ");

        for(int i = n-2; i > 0; i--)
        {
            if(current_leader < arr[i])
            {
                current_leader = arr[i];
                System.out.print(current_leader+ " ");
            }


        }
    }

    public static void main(String[] args) {
        
        int[] arr = {23, 32, 98, 76, 10};
        int n = arr.length;

        leaders_in_an_array(arr, n);
    }
}
