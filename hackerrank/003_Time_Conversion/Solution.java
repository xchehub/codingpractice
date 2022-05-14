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
import java.text.SimpleDateFormat;  
import java.util.Date;  

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String result = "";
            
        if (s.indexOf("AM") >= 0) {
            String noPMAMStr = s.substring(0, s.indexOf("AM"));
            String[] temp = noPMAMStr.split(":");
            if (Integer.parseInt(temp[0]) == 12) {
                result = "00:" + temp[1] + ":" + temp[2];
            } else {
                result = temp[0] + ":" + temp[1] + ":" + temp[2];
            }
        } else if (s.indexOf("PM") >= 0) {
            String temp = s.substring(0, s.indexOf("PM"));
            String[] tempStrs = temp.split(":");
            if (Integer.parseInt(tempStrs[0]) == 12) {
                result = tempStrs[0] + ":" + tempStrs[1] + ":" + tempStrs[2];
            } else {
                result = (Integer.parseInt(tempStrs[0]) + 12) + ":" + tempStrs[1] + ":" + tempStrs[2];
            }
        } else {
            // no AM, PM case
            return s;
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        String result = Result.timeConversion("12:45:54PM");
        System.out.println(result);
        result = Result.timeConversion("07:05:45PM");
        System.out.println(result);
        result = Result.timeConversion("12:05:45PM");
        System.out.println(result);
        result = Result.timeConversion("12:05:4AM");
        System.out.println(result);
    }
}
