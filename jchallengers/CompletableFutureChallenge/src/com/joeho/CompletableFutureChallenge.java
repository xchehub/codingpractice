package com.joeho;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collectors;

// ref. https://javachallengers.com/completable-future-san-francisco-adventure-java-challenge/

public class CompletableFutureChallenge {
    static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
	// write your code here
        CompletableFuture<List<String>> adventureStart = new CompletableFuture<>();

        Supplier<List<String>> sanFranSightSupplier = () ->
                List.of("Alcatraz", "Cable car", "Golden Gate", "Lombard Street");

        adventureStart.completeAsync(sanFranSightSupplier, executorService)
                .thenCompose(sights -> {
                    return CompletableFuture.supplyAsync(() -> sights.stream()
                            .map(String::length)
                            .collect(Collectors.toList()));
                })
                .thenAccept(
                        ratings -> {
                            var rating = ratings.stream()
                                    .dropWhile(sightRating -> sightRating <= 12)
                                    .findFirst()
                                    .orElse(0);
                            System.out.println("Rating: " + rating);
                        });
        System.out.println("time to go to home :( ");
    }
}

//    At first, we are populating a Supplier instance with a list.
//    Supplier sanFranSightSupplier = () -> List.of("Alcatraz", "Cable Car", "Golden Gate", "Lombard Street");
//    Then the whole process will be made asynchronously.
//    Basically what will happen in this piece of code is that the stream of String from sanFranSightSupplier will be
//    transformed into the length of each String.
//
//    adventureStart.completeAsync(sanFranSightSupplier, executor)
//        .thenCompose(sights -> {
//        return CompletableFuture.supplyAsync(() -> sights.stream()
//            .map(String::length)
//            .collect(Collectors.toList())); })
//
//    Then all Strings that are lower or equal to 12 will be dropped.
//    In the end, the length of Lombard Street will remain on the list.
//        .thenAccept(ratings -> { var rating = ratings.stream()
//            .dropWhile(sightRating -> sightRating <= 12)
//            .findFirst()
//            .orElse(0);
//        System.out.print("Rating: " + rating + " "); });
//
//    Therefore, the output will be:
//    time to go home :( Rating: 14

