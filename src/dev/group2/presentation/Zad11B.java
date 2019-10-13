package dev.group2.presentation;

public class Zad11B {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);


        System.out.println();
        i = 10;

        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println();
        i = 0;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 40);
    }
}
