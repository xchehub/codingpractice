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

    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     * Function Description
     * Complete the miniMaxSum function in the editor below.
     * miniMaxSum has the following parameter(s):
     * arr: an array of  integers
     */

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int maxValue = 0;
        int minValue = 0;
        
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++ ) {
            int arrNum = arr.get(i);
            if (i != arr.size()-1) {
                minValue += arrNum;
            }
            if (i != 0) {
                maxValue += arrNum;    
            }
        }
        System.out.println(minValue + " " + maxValue);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


        // List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        //Collections.sort(arr);