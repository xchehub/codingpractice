public class NumOfOneBits {
    public static int numOfOneBits(int n) {
        int count = 0;
        
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int hammingWeight2(int n) {
        int counter = 32;
        int result = 0;
        while (counter > 0) {
            int last = n & 1;
            if (last ==  1) {
                result++;
            }
            n = n >> 1;
            counter--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numOfOneBits(33));
        System.out.println(numOfOneBits(999));

        System.out.println(hammingWeight2(33));
        System.out.println(hammingWeight2(999));
    }
       
}