import java.lang.String;

public class ReverseWordsinaString {
    
    public static String reverseWords(String s) {
        s = s.trim();
        
        String[] wordsList = s.split("\s+");
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = wordsList.length - 1; i >= 0; i--) {
            temp = wordsList[i].trim();
            sb.append(temp + " ");
        }
        
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  the sky is blue  ";
        System.out.println(reverseWords(s));
        String s2 = "a good   example";
        System.out.println(reverseWords(s2));
    }
}
