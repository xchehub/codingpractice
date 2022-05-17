import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, "Tom"));
        list.add(new Person(2, "Todd"));
        list.add(new Person(3, "Peter"));

        list = list.stream().filter(person -> person.getId() > 1).collect(Collectors.toList());

        List<Long> idList = list.stream().map(person -> person.getId()).collect(Collectors.toList());

        System.out.println(list.size());
        System.out.println(idList.size());

    }
}

class Person {
    private long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public long setId(long id) {
        return this.id = id;
    }
}
