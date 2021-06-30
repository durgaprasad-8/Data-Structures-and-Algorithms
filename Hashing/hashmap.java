// working of hashmap

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) 
    {

        HashMap<String, Integer> m = new HashMap<>();

        m.put("thor", 1500);
        m.put("jane", 33);
        m.put("loki", 1200);

        System.out.println(m);
        System.out.println(m.size());

        // iterating over hashmap

        for(Map.Entry<String, Integer>e : m.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        if(m.containsKey("Thor"))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        m.remove("loki");

        if(m.containsValue(1500))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        System.out.println(m.get("thor"));

        System.out.println(m.get("loki"));
    }
    
}
