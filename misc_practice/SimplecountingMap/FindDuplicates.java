import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
    public static void main (String[] args) {
        List<String> list = Arrays.asList("john", "Dennis", "john");
        HashMap<String, Integer> map = new HashMap();
        list.forEach( p -> {
            Integer count = map.get(p);
            map.put(p, count == null ? 1 : count + 1);
        });

        map.entrySet().forEach(p-> {
            System.out.println("Value: " + p.getKey() + "/ Times: " + p.getValue());
        });
    }
}