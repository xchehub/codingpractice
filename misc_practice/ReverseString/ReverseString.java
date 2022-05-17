import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
    public static void main(String[] args) {
        String origStr = "Hello World!";
        String revStr = "";
        char ch;

        System.out.println("Original String: " + origStr);
        System.out.print("==Sol 1.==");
        for (int i = 0; i < origStr.length(); i++) {
            ch = origStr.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("Reversed String: " + revStr);

        System.out.print("==Sol 2.==");
        byte[] origStrByteArray = origStr.getBytes();
        byte[] revStrByteArray = new byte[origStrByteArray.length];

        for (int i = 0; i < origStrByteArray.length; i++) {
            revStrByteArray[i] = origStrByteArray[origStrByteArray.length - 1 - i];
        }
        System.out.println("Reversed String: " + new String(revStrByteArray));

        System.out.print("==Sol 3.==");
        StringBuilder origStringBuilder = new StringBuilder();
        origStringBuilder.append(origStr);
        origStringBuilder.reverse();
        System.out.println("Reversed String: " + origStringBuilder.toString());

        System.out.print("==Sol 4.==");
        char[] origStrCharArray = origStr.toCharArray();
        System.out.print("Reversed String: ");
        for (int i = origStrCharArray.length -1; i >= 0; i--) {
            System.out.print(origStrCharArray[i]);
        }
        System.out.println();

        System.out.print("==Sol 5.==");
        StringBuffer origStrBuffer = new StringBuffer(origStr);
        System.out.println("Reversed String: " + origStrBuffer.reverse());

        System.out.print("==Sol 6.==");
        char[] newOrigStrCharArray = origStr.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c: newOrigStrCharArray) {
            charList.add(c);
        }
        Collections.reverse(charList);
        ListIterator li = charList.listIterator();
        System.out.print("Reversed String: ");
        while(li.hasNext()) {
            System.out.print(li.next());
        }
        System.out.println();

        System.out.print("==Sol 7.==");
        char[] newOrigCharArray = origStr.toCharArray();
        int right = newOrigCharArray.length -1; 
        int left =0;

        for (left = 0; left < right; left++, right--) {
            char temp = newOrigCharArray[left];
            newOrigCharArray[left] = newOrigCharArray[right];
            newOrigCharArray[right] = temp;
        }
        System.out.print("Reversed String: ");
        for (char c: newOrigCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}