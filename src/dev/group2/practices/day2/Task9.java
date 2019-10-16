package dev.group2.practices.day2;

public class Task9 {

    public static void main(String[] args) {
        int value = 13;

        boolean isFirst = true;
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                isFirst = false;
                break;
            }
        }
        if (isFirst) {
            System.out.print(value + " jest pierwsza ");
        } else {
            System.out.print(value + " nie jest pierwsza ");
        }


    }
}
