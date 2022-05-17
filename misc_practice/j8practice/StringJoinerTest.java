import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner name = new StringJoiner(",", "[", "]");
        name.add("Willim");
        name.add("Rick");

        StringJoiner country = new StringJoiner(";", "{", "}");
        country.add("Canada");
        country.add("USA");

        StringJoiner merged = name.merge(country);
        System.out.println(merged.toString());
    }
}
