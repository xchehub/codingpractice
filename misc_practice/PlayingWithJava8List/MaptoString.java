import java.util.*;
import java.util.stream.Collectors;

public class MaptoString {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        List<Integer> intList = new ArrayList<>(map.keySet());
        System.out.println(intList);
        List<String> stringList = new ArrayList<>(map.values());
        System.out.println(stringList);

        List<Integer> intList1 = map.keySet().stream().collect(Collectors.toList());
        System.out.println("Using stream: " + intList1);
        List<String> stringList1 = map.values().stream().collect(Collectors.toList());
        System.out.println("Using stream string: " + stringList1);

        List<String> stringListFilter = map.values().stream().filter(v -> v.length() > 3).collect(Collectors.toList());
        System.out.println("Using stream string filter: " + stringListFilter);
    }
}
