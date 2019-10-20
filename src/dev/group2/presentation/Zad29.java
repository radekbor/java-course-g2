package dev.group2.presentation;

import java.util.Arrays;

public class Zad29 {

    public static void main(String[] args) {
        Song s = new Song() {
            @Override
            public void play() {
                System.out.println("bla bla");
            }
        };
        s.play();
        foo(1, new int[]{2, 3});
    }

    static void foo(int x, int... args) {
        System.out.println(Arrays.toString(args));
    }
}

interface Song {
    void play();
}
