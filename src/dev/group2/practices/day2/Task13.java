package dev.group2.practices.day2;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        Random r = new Random();

        int samples = 10000;
        int count = 0;
        for (int i = 0; i < samples; i++) {
            double x = r.nextDouble();
            double y = r.nextDouble();

            double len = Math.sqrt(x*x + y*y);
            if (len <= 1) {
                count++;
            }
        }
        double pi = ((double)count / samples) * 4;
        System.out.print("PI:" + pi);
    }
}
