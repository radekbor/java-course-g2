package dev.group2.practices.day2;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
           tab[i] = 2 * i;
        }
        System.out.print(Arrays.toString(tab));
    }
}
