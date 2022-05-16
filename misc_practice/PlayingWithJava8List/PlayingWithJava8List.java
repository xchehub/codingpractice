import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayingWithJava8List {
    public static void main(String[] args) {
        List<Employee> listEmployees = populateEmployeeList();
        // for (Employee emp :  listEmployees) {
        //     System.out.println(emp);
        // }

        // listEmployees.forEach(System.out::println);
        listEmployees.forEach(p -> System.out.println(p));

        Employee john = listEmployees.stream().filter( emp -> emp.firstName.equals("John")).findAny().orElse(null);
        System.out.println(john);
        System.out.println("=======");

        List<Employee> londonEmployees = listEmployees.stream().filter(emp -> emp.address.city.equals("London")).collect(Collectors.toList());
        // londonEmployees.forEach(System.out::println);
        System.out.println(londonEmployees);

        System.out.println("=======");

        Map<String, Employee> employeeMap = listEmployees.stream().collect(Collectors.toMap(e -> e.firstName, e -> e));
        employeeMap.entrySet().forEach(emp -> System.out.println(String.format("%s - %s", emp.getKey(), emp.getValue())));
        System.out.println("=======");
        
        Map<String, Employee> johnMap = employeeMap.entrySet().stream().filter(e -> e.getKey().equals("John")).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        System.out.println(johnMap);

        System.out.println("==johnMap1=====");
        Map<String, Employee> johnMap1 = employeeMap.entrySet().stream().filter(e -> e.getKey().equals("John")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(johnMap1);

        System.out.println("==Function identity=====");
        Map<String, Employee> employeeMap1 = listEmployees.stream().collect(Collectors.toMap(e -> e.firstName, Function.identity()));
        employeeMap1.entrySet().forEach(emp -> System.out.println(String.format("%s - %s", emp.getKey(), emp.getValue())));
        
        
    }    

    private static List<Employee> populateEmployeeList() {
        List<Employee> personList = Arrays.asList(
            createPerson("John", "Dennis", "Whitehall St", "London", 600055),
            createPerson("Phil", "Coulson", "Grandbridge St", "Ashburn", 745454),
            createPerson("David", "Fairlie", "Nelson St", "London", 745454)
        );

        return personList;
    }

    private static Employee createPerson(String firstName, String lastName, String streetAddress, String city, int postelCode) {
        return new Employee(firstName, lastName, new Address(streetAddress, city, postelCode));
    }
}

class Employee {
    public String firstName, lastName;
    public Address address;

    public Employee(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString() {
        return "Employ [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
    }
}

class Address {
    public String streetName, city;
    public int postelCode;

    public Address(String streetName, String city, int postelCode) {
        this.streetName = streetName;
        this.city = city;
        this.postelCode = postelCode;
    }

    public String toString() {
        return "Address [streetName=" + streetName + ", city=" + city + ", postelCode=" + postelCode + "]";
    }
}

