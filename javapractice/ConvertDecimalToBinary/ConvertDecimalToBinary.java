import java.util.Scanner;

/**
 * Java program to convert Decimal number into Binary in Java.
 *
 */
public class ConvertDecimalToBinary {

    public static byte[] toBinary(int number) {
        byte[] binary = new byte[32];
        int index = 0;
        while (number > 0) {
            binary[index++] = (byte) (number % 2);
            number = number / 2;
        }
        return binary;
    }

    public static void printBinary(byte[] binary) {
        for(int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void convert(int number) {
        int input = number;
        StringBuilder sb = new StringBuilder();

        while (input > 0) {
            byte bit = (byte) (input % 2);
            sb.append(bit);
            input = input / 2;
        }
        System.out.printf("Decimal %d in binary is %s %n", number, sb.toString());
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.MAX_VALUE;

        while (number != 0) {
            System.out.print("Enter a decimal number to convert into binary format\n");

            number = sc.nextInt();
            byte[] bits = toBinary(number);
            printBinary(bits);
            System.out.println();
            convert(number);
        }

        sc.close();
    }
}