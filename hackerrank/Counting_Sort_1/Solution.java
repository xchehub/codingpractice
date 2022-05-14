import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num: arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) +1);
            } else {
                freqMap.put(num, 1);
            }
        }
        
        for (int index = 0; index <100; index++) {
            if (freqMap.get(index) != null) {
                result.add(index, freqMap.get(index));
            } else {
                result.add(index, 0);
            }
        } 
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        List<Integer> arr = Stream.of("63 54 17 78 43 70 32 97 16 94 74 18 60 61 35 83 13 56 75 52 70 12 24 37 17 0 16 64 34 81 82 24 69 2 30 61 83 37 97 16 70 53 0 61 12 17 97 67 33 30 49 70 11 40 67 94 84 60 35 58 19 81 16 14 68 46 42 81 75 87 13 84 33 34 14 96 7 59 17 98 79 47 71 75 8 27 73 66 64 12 29 35 80 78 80 6 5 24 49 82".replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);
        System.out.println(Arrays.toString(result.toArray()));

        arr = Stream.of("63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33".replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        result = Result.countingSort(arr);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
