
public class StringMask {

    public static String maskIDString(String idString, String pattern) {
        StringBuilder maskedString = new StringBuilder();
        for (int i = 0; i < idString.length(); i++) {
            if (pattern.charAt(i) == '#') {
                maskedString.append(idString.charAt(i));
            } else {
                maskedString.append(pattern.charAt(i));
            }
        }
        return maskedString.toString();
    }

    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{3})", "$1 $2 $3 $4"));

        String id = "A123456789";
        System.out.println(maskIDString(id, "#*###*****"));
    }

    // ref. https://www.javacodex.com/Strings/Mask-Account-Number

}