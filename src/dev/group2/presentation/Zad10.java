package dev.group2.presentation;

public class Zad10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i*2 + " ");
        }

        /*
        * X
        * XX
        * XXX
        * XXXX
        * ......
        * */
        System.out.println();

        int x = 5;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
