package dev.group2.presentation;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zad39 {

    public static void main(String[] args) {

        Function<String, Integer> l1 = (napis) -> napis.length();

        System.out.println(l1.apply("Hello"));

        Consumer<Integer> l2 = value -> System.out.println(value);

        l2.accept(200);

        Predicate<Integer> l3 = value -> value % 3 == 0;

        System.out.println(l3.test(123));
        System.out.println(l3.test(124));

        // obiekt do pobierania wartosci losowych
        Random r = new Random();
        Supplier<Integer> l4 = () -> r.nextInt();

        System.out.println(l4.get());
        System.out.println(l4.get());
        System.out.println(l4.get());

    }
}
