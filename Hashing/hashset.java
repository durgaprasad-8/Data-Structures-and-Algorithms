// working of hashset

import java.util.*;

class hashset
{
    private static boolean add;

    public static void main(String[] args) 
    {

        HashSet<String> h = new HashSet<String>();

        h.add("Thor");
        // h.add("Jane");
        h.add("Loki");
        h.add("Jane");

        System.out.println(h);

        System.out.println(h.contains("Thor"));

        Iterator<String> i = h.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next()+ " ");
        }

        System.out.println(h.size());

        h.remove("Jane");

        System.out.println(h.size());

        for(String s:h)
        {
            System.out.println(s+ " ");
        }

        System.out.println(h.isEmpty());


    }
}