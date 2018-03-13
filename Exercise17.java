package Chapter11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
every key in the first map is also contained in the second map and maps to the same value in the second map. For
example, {Smith=949–0504, Marty=206–9024} is a submap of {Marty=206–9024, Hawking=123–4567,
Smith=949–0504, Newton=123–4567}. The empty map is a submap of every map.
 */
public class Exercise17 {
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");

        Exercise17 exercise17 = new Exercise17();
        System.out.println(exercise17.supMap(map1, map2));
    }

    private boolean supMap(Map<String, String> map1, Map<String, String> map2)
    {
        if (map1.size() == 0) return true;
        else
        {
            Set<String> set = new HashSet<>(map1.keySet());

            for (String names:set)
            {
                if (!map2.containsKey(names)) return false;
                else if (!map2.get(names).equals(map1.get(names))) return false;
            }
        }
        return true;
    }
}
