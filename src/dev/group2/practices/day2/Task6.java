package dev.group2.practices.day2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int X = 5;
        int[][] tab = new int[X][X];

        int n = X-1;
        for (int i = 0; i < X; i++) {
            tab[i][i] = 1;
            tab[i][n-i] = 1;
        }
        for (int i = 0; i < X; i++) {
            System.out.println
                    (Arrays.toString(tab[i]));
        }
    }
}
