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
        
    }
}
