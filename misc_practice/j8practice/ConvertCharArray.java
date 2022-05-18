import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertCharArray {

    public static void main(String[] args) {

        char[] randomStr = {'r', 'a', 'n', 'd', 'o', 'm'};
        System.out.println(new String(randomStr));

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < randomStr.length; i++) {
            strBuilder.append(randomStr[i]);
        }
        System.out.println(strBuilder.toString());

        String strValue = String.copyValueOf(randomStr);
        System.out.println(strValue);

        String strStream = Stream.of(randomStr).map(arr -> new String(arr)).collect(Collectors.joining());
        System.out.println(strStream);
    }
}
