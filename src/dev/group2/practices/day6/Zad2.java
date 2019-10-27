package dev.group2.practices.day6;

import java.util.Collection;

public class Zad2 {
    public static void main(String[] args) {

        Pair<Integer> pair = new Pair<>(1, 10);
        System.out.println(pair.max());
        System.out.println(pair.min());
    }

    void foo(Collection<? extends Integer> collection) {

    }

    void foo2(Collection<? super Integer> collection) {

    }
}

class Pair<T extends Comparable<T>> {

    final T a;
    final T b;

    Pair(T a, T b) {
        this.a = a;
        this.b = b;
    }

    T min() {
        if(a.compareTo(b) < 0) {
            return a;
        } else {
            return b;
        }
    }

    T max() {
        if(a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
