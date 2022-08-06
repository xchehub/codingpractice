import java.util.ArrayList;
import java.util.Collections;

public class hnbank106q4 {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        String[] data = { "E", "C", "B", "D", "A" };
        for (String s : data) {
            alist.add(s);
        }
        System.out.println(alist);
        Collections.sort(alist);
        System.out.println(alist);
        Collections.reverse(alist);
        System.out.println(alist);
    }
}