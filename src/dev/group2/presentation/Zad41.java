package dev.group2.presentation;

import java.util.stream.Stream;

public class Zad41 {

    public static void main(String[] args) {

        long z3 = 3_000_000_000L;
        Stream<Integer> iterate = Stream
                .iterate(0, i -> i + 1)
                .limit(100);

        iterate.forEach(System.out::println);

        System.out.println("<--->");

        Stream<Integer> iterate2 = Stream
                .iterate(0, i -> i + 1)
                .filter(i -> i % 3 == 0 || i % 4 == 0)
                .limit(30);

        iterate2.forEach(System.out::println);

    }
}
