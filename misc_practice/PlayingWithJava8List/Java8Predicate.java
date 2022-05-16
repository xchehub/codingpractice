import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
    public static void main(String[] args) {
        List<Student> studList = Student.getStudentList();

        Map<String, Student> map = studList.stream().collect(Collectors.toMap(p -> p.name, p -> p));
        Map<String, Student> filteredMap =  getPredicateData(map, x -> x.mark >= 95);
        System.out.println(filteredMap);
    }

    public static <K, V> Map<K, V> getPredicateData(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet().stream().filter(x -> predicate.test(x.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }
}
