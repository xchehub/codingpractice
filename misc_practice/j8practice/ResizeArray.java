import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ResizeArray {
    // Resize an Array While Keeping the Current Elements in Java

    public static void main(String[] args) {
        int arr[] = new int[]{12,34,21,33,22,55};
        for(int a: arr) {
            System.out.print(a+" ");
        }
        List<Integer> list = new ArrayList<>();
        for(int a: arr) {
            list.add(a);
        }
        System.out.println("\n"+list);
        list.add(100);
        System.out.println(list);
        System.out.println("===========================================================");
        int arr2[] = new int[10];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.out.println();
        for(int a: arr2) {
            System.out.print(a+" ");
        }
        System.out.println();
        arr2[6] = 100;
        for(int a: arr2) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("===========================================================");
        int arr3[] = Arrays.copyOf(arr, 10);
        System.out.println();
        for(int a: arr3) {
            System.out.print(a+" ");
        }
        System.out.println();
        arr3[6] = 100;
        for(int a: arr3) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
