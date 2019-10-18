package dev.group2.practices.day2;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int a = 112;

        boolean[]tab = new boolean[a/2 + 1];
        int count = 0;
        for (int i = 1; i <= a/2; i++) {
            if (a % i == 0) {
                tab[i] = true;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 1, j = 0; i < tab.length; i++) {
            if (tab[i]) {
                result[j++] = i;
            }
        }
        System.out.print(Arrays.toString(result));
    }
}
