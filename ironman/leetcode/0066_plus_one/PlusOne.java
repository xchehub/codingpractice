import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        // plus one
        digits[digits.length-1] += 1;
        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i-1] += 1; 
            }
        }
        if (digits[0] == 10) {
            int[] newResult = new int[digits.length+1];
            newResult[0] = 1;
            newResult[1] = 0;
            for(int i = 2; i < newResult.length; i++) {
               newResult[i] = digits[i-1];
            }
            return newResult;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        plusOne(digits);
        System.out.println(Arrays.toString(digits));

        int[] digits2 = {2, 3, 4};
        plusOne(digits2);
        System.out.println(Arrays.toString(digits2));
        
        int[] digits3 = {2, 3, 4, 9};
        plusOne(digits3);
        System.out.println(Arrays.toString(digits3));

        int[] digits4 = {9, 9, 9, 9};
        plusOne(digits4);
        System.out.println(Arrays.toString(digits4));
        
    }
}

