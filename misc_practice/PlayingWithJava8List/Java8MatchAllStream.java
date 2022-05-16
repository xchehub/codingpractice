import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8MatchAllStream {
    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.name.startsWith("D");
        Predicate<Student> p2 = s -> s.mark > 80;
        List<Student> studentList = Student.getStudentList();

        boolean p1_result = studentList.stream().anyMatch(p1);
        System.out.println("p1_result: " + p1_result);

        boolean p2_result = studentList.stream().anyMatch(p2);
        System.out.println("p2_result: " + p1_result);

        boolean p3_result = studentList.stream().allMatch(p1);
        System.out.println("p3_result: " + p3_result);

        boolean p4_result = studentList.stream().noneMatch(p1);
        System.out.println("p4_result: " + p4_result);

    }
}

class Student {
    public String name;
    public int id, mark;

    public Student(int id, String name, int mark) {
        super();
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return "Student [name=" + name + ", id = " + id + ", mark = " + mark + "]";
    }

    public static List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Dennis", 95));
        list.add(new Student(2, "Phil", 85));
        list.add(new Student(3, "Nancy", 90));
        list.add(new Student(4, "Randy", 100));
        
        return list;
    }
}