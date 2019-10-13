package dev.group2.presentation;

public class Zad11 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        i = 0;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
