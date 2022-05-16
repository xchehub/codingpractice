import java.util.*;
import java.util.stream.Collectors;

public class MaptoSort {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(4, "four");
        map.put(3, "three");
        
        System.out.println("Before sort: " + map);

        Map<Integer, String> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("After sort: " + result);

    }
}
