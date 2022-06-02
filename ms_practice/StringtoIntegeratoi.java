import java.lang.String;

public class StringtoIntegeratoi {

    public static int myAtoi(String s) {
        s = s.trim();
        boolean isNegative = false;
        int ans = 0, i = 0;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') isNegative = true;
            i++;
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) break;
            if (ans > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10)
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            ans = ans * 10 + (s.charAt(i) - '0');
        }
        return isNegative ? -1 * ans : ans;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("-91283472332"));
    }
}