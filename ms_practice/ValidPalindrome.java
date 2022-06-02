public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        } 
        boolean result = true;
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (newString.length() == 0) {
            return true;
        }
        int i =0;
        int j = newString.length() - 1;
        while (i < j) {
            if (newString.charAt(i) != newString.charAt(j)) {
                result = false;
                break;
            }
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("a."));
        System.out.println(isPalindrome("reace a car"));
        System.out.println(isPalindrome(" "));
    }
}