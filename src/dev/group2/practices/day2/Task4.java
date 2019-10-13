package dev.group2.practices.day2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i * j;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(
                    Arrays.toString(result[i]));
        }
    }
}
