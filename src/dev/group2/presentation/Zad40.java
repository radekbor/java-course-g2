package dev.group2.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zad40 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> result = list.stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toList());

        System.out.println(result);

        // suma zmiennej list
        IntStream intStream1 = list.stream().mapToInt(i -> i);
        IntStream intStream2 = list.stream().mapToInt(i -> i);

        System.out.println(intStream1.sum());
        System.out.println(intStream2.summaryStatistics());

        // reduce
        int sum = list.stream().reduce(0, (a, b) -> a+b);
        System.out.println(sum);

        Optional<Integer> reduce =
                list.stream().reduce((a, b) -> a + b);
        System.out.println(reduce);
        Optional<Integer> empty =
                new ArrayList<Integer>().stream().reduce((a, b) -> a + b);
        System.out.println(empty);

    }
}
