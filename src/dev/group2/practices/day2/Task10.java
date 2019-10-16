package dev.group2.practices.day2;

public class Task10 {
    public static void main(String[] args) {
        int value = 81;

        int dzielnik = 2;
        while (value > 1) {
            if (value % dzielnik == 0) {
                value /= dzielnik;
                System.out.println(dzielnik);
            } else {
                dzielnik++;
            }
        }

    }
}
