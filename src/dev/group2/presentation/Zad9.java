package dev.group2.presentation;

public class Zad9 {
    public static void main(String[] args) {

        int x = 5;
        switch (x) {
            case 2:
                System.out.println("to dwa");
                break;
            case 3:
                System.out.println("to trzy");
                break;
        }

        int x2 = 4;
        final int five = 5;
        switch (x2) {
            default:
                System.out.println("default");
                break;
            case five:
                System.out.println("to piec");
                break;
            case 3:
                System.out.println("to trzy");
                break;
        }


    }
}
