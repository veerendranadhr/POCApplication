package com.bt.core.java;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {


    public static void main(String[] args) {
/*
        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_00)
          //      .parallel() //  with this 23s, without this 1m 10s
                .filter(ParallelStreamExample::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();

        System.out.println("\nTotal: " + count);
        
        */
        
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);


    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
