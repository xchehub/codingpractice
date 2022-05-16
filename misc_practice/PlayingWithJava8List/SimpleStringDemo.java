import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleStringDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Dennis", "Phil", "Coulson", "John");
        System.out.println(names);

        Map<String, Integer> map = names.stream().collect(Collectors.toMap(e -> e, String::length, (e1, e2) -> e1));
        System.out.println(map);

        Map<String, Integer> map1 = names.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map1);

    }
}
