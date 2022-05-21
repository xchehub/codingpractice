import java.util.Arrays;

public class ArrayCloning {
    public static void main(String[] args) {
        int[] array = {23, 43, 55, 12, 65, 88, 92};
        int[] copiedArray = new int[3];

        System.arraycopy(array, 0, copiedArray, 0, 3);

        // Both of these methods do a shallow copy of objects if applied on an array of non-primitive object types.
        int newLength = array.length;
        int[] copiedArray2 = Arrays.copyOf(array, newLength);
        int[] copiedArray3 = Arrays.copyOfRange(array, 1, 4);

        // Object.clone() is inherited from Object class in an array.
        int[] copiedArray4 = array.clone();

        String[] strArray = {"orange", "red", "green"};
        String[] copiedStrArray = Arrays.stream(strArray).toArray(String[]::new);
        int[] original = { 10, 20, 30 };
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    
        // 2d array 
        int[][] source = {
            {1, 2, 3, 4},
            {5, 6},
            {0, 2, 42, -4, 5},
        };
        int[][] destination = new int[source.length][];
        for (int i =0; i < source.length; i++) {
            destination[i] = new int[source[i].length];
            for (int j = 0; j < destination[i].length; j++) {
                destination[i][j] = source[i][j];
            }
        }
        System.out.println(Arrays.deepToString(destination));
    }
}
