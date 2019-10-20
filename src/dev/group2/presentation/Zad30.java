package dev.group2.presentation;

public class Zad30 {

    public static void main(String[] args) {


        foo(new int[]{1, 2, 3});
        bar(new int[]{1, 2, 3});
        bar(1, 2, 3);
    }

    static void foo(int[] arg) {
        System.out.println("foo");
    }

    static void bar(int... arg) {
        System.out.println("bar");
    }
}
