package dev.group2.presentation;

import java.time.LocalDateTime;

public class Zad7 {
    public static void main(String[] args) {
        /*/
        NAPIS:
        0_1_2_3_4_5_6_7_8_9
        10_...............19
        20_...............29
         */
        String result = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3_000; i++) {
            for (int j = 0; j < 10; j++) {
                int value = i*10 + j;
                result += value;
                if (j != 9) {
                    result +="_";
                }
            }
            result += "\n";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        StringBuilder result2 = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 3_000; i++) {
            for (int j = 0; j < 10; j++) {
                int value = i*10 + j;
                result2.append(value);
                if (j != 9) {
                    result2.append("_");
                }
            }
            result2.append("\n");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

//        System.out.println(result);
    }
}
