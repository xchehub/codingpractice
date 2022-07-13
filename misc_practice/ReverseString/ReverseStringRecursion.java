public class ReverseStringRecursion {

    private static int i = 0;

    public static void main(String args[]) {
        reverse("Hello");
        System.out.println("=====");
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverse(String str) {
        int localI = i++;
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        System.out.println("Step " + localI + ": " + str.substring(1) + " / " + str.charAt(0));
        String reversed = reverse(str.substring(1)) + str.charAt(0);

        System.out.println("Step " + localI + " returns: " + reversed);
        return reversed;
    }

    public static String reverseString(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}