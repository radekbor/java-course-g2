package dev.group2.revision;

public class Test2 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        // int, long, double float
        int odp1 = tab[0];

        final int tab2[] = {1, 2};
        // final w odniesieniu do tablic
        // mowi nam o rozmiarze i wymiarach
        // short odp2 = tab2[0];

        int tab3[][] = {
                {1, 2, 3},
                {4, 5, 6, 6},
                {7, 8, 9}
        };
        System.out.println(tab3.length);
        System.out.println(tab3[1].length);
        int index = 4;
//        System.out.println(tab3[index].length);

        int[] odp3 = tab3[1];

        int odp4 = tab3[1][2];

        int[][][][] tab4 = new int[3][4][3][3];
        int[][] odp5 = tab4[2][1];
        int x = tab4[1][1][1][1];
        System.out.println(x);
//         long[][] odp6 = tab4[2][1];
        // nie wolno rzutowac tablic

    }
}
