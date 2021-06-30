// intersection of two arrays

import java.util.*;

public class intersection_arrays 
{

    static int intersection(int arr1[], int arr2[], int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < n; i++)
        {
            hs.add(arr1[i]);
        }

        int result = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(hs.contains(arr2[i]))
            {
                result++;
                hs.remove(arr2[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        
        int arr1[] = {4, 90, 34, 87};
        int arr2[] = {4, 90, 87, 77};

        int n = arr2.length;

        System.out.println(intersection(arr1, arr2, n));
    }
    
}
