import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
    public static String[] solution(String[] inputArray) {
        List<String> longestStringList = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == maxLength) {
                longestStringList.add(inputArray[i]);
            } else if (inputArray[i].length() > maxLength) {
                longestStringList.clear();
                maxLength = inputArray[i].length();
                longestStringList.add(inputArray[i]);
            }
        }
        String[] result = new String[longestStringList.size()];
        longestStringList.toArray(result);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aba", 
        "aa", 
        "ad", 
        "vcd", 
        "aba"}));

        System.out.println(solution(new String[]{"aa"}));

        System.out.println(solution(new String[]{"abc", 
        "eeee", 
        "abcd", 
        "dcd"}));

        System.out.println(solution(new String[]{"a", 
        "abc", 
        "cbd", 
        "zzzzzz", 
        "a", 
        "abcdef", 
        "asasa", 
        "aaaaaa"}));

        System.out.println(solution(new String[]{"enyky", 
        "benyky", 
        "yely", 
        "varennyky"}));
    }

}