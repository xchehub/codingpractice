/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 */

public class AlmostIncreasingSequence {
    public static boolean almostIncreasingSequence(int[] sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                count++;
                if (i > 0 && i+2 < sequence.length && sequence[i-1] >= sequence[i+1] && sequence[i+2] <= sequence[i]) {
                    return false;
                }
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] sequence2 = {1, 2, 3, 4, 3, 6};
        System.out.println(almostIncreasingSequence(sequence2));
    }
}