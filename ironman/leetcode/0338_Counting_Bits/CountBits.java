import java.util.Arrays;
public class CountBits {
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(255)));
    }
}
