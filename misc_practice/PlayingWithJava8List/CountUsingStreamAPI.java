import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountUsingStreamAPI {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("CPU", "MONITOR", "KEY BOARD", "MOUSE", "CPU", "MOUSE", "MOUSE");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
