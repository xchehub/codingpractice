import java.util.Arrays;

class checksorted {
    
    static boolean checkSorted(int n, int arr[]) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }
        Arrays.sort(b, 0, n);

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != b[i]) {
                counter++;
            }
        }
        if (counter == 0 || counter == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 4, 2};
        System.out.println(checkSorted(arr.length, arr));
    }

}
