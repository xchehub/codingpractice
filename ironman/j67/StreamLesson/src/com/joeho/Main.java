package com.joeho;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                .filter(s -> s.isEmpty())
                .count();
        System.out.printf("List %s has %d empty string %n", strList, count);

        long num = strList.stream()
                .filter(s -> s.length() > 3)
                .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

        count = strList.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.printf("List %s had %d strings started with 'a' %n", strList, count);

        List<String> filtered = strList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        System.out.printf("Original List: %s, Lsit without Empty string: %s %n", strList, filtered);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.printf(G7Countries);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream()
                .map(i -> i*i).distinct()
                .collect(Collectors.toList());
        System.out.printf("Original List: %s, Square without duplicate: %s %n", numbers, distinct);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) ->x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());

    }
}
