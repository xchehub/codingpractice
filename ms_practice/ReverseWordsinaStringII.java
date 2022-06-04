public class ReverseWordsinaStringII {

    public static void reverseWords(char[] s) {

    }

    public static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void reverseEachWord(char[] s) {
        int n = s.length;
        int start = 0;
        int end = 0;

        while (start < n) {
            while (end < n && s[end] != ' ') {
                end++;
            }
            reverse(s, start, end - 1);
            start = end + 1;
            end++;
        }
    }
 
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseEachWord(s);
        System.out.println(s);
        char[] s2 = {'t', 'h', 'e', ' ', 's', 'k' , 'y', ' ', 'i' , 's', ' ', 'b', 'l', 'u', 'e'};
        reverseEachWord(s2);
        System.out.println(s2);
    }
}