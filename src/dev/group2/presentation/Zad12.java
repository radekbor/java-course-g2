package dev.group2.presentation;

public class Zad12 {
    public static void main(String[] args) {
        x: for (int i = 1;;i++) {
            if (i % 127 == 0) {
                break;
            }
            System.out.println(i);
        }

        petla: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
                if (i+j == 15) {
                    System.out.println("break");
                    break petla;
                }
            }
        }

        petla: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
                if (i+j == 15) {
                    System.out.println("continue");
                    continue petla;
                }
            }
        }
    }
}
