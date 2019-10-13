package dev.group2.presentation;

import java.util.Arrays;

public class Zad5 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array1));

        int[][][] excel = new int[10][3][4];
        int[][] excelSheet = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("<----->");
        System.out.println(Arrays.toString(excelSheet[0]));
        System.out.println(Arrays.toString(excelSheet[1]));

        excelSheet[0][2] = 100;
        System.out.println("<----->");
        System.out.println(Arrays.toString(excelSheet[0]));
        System.out.println(Arrays.toString(excelSheet[1]));

        excelSheet[1] = new int[]{1, 2, 3};
        System.out.println("<----->");
        System.out.println(Arrays.toString(excelSheet[0]));
        System.out.println(Arrays.toString(excelSheet[1]));

        System.out.println(excelSheet.length);
        System.out.println(excelSheet[0].length);

        int x[] = new int[10];
        System.out.println(x[1]);

        final int[] tab = {1, 2, 3, 4, 5};

        tab[1] = 100;
        System.out.println(Arrays.toString(tab));






    }
}
