import java.util.*;

public class javaSetPractice {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(43);
        numbers.add(62);
        numbers.add(97);
        numbers.add(97);

        System.out.println(numbers.toString());

        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.add(43);
        orderedNumbers.add(63);
        orderedNumbers.add(97);
        orderedNumbers.add(97);

        System.out.println(orderedNumbers.toString());
    }
}