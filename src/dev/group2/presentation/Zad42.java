package dev.group2.presentation;

import java.util.Optional;

public class Zad42 {

    public static void main(String[] args) {
        Optional<Integer> maybeInteger = Optional.of(12);
        System.out.println(maybeInteger);

        Integer i = null;
        Optional<Integer> empty = Optional.ofNullable(i);
        System.out.println(empty);

        Optional<Integer> maybeInteger2 =
                maybeInteger.map(x -> x * 2);

        System.out.println(maybeInteger2);

        System.out.println(empty.orElse(0));

        if (maybeInteger.isPresent()) {
            System.out.println(maybeInteger.get());
        }

        maybeInteger.ifPresent(x -> System.out.println(x));


        System.out.println(maybeInteger.filter(x -> x > 12));

        Optional<Integer> integer = maybeInteger
                .flatMap(x -> Optional.of(x*2));
        System.out.println(integer);
    }

}
