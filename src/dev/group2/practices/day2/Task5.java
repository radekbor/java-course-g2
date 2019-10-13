package dev.group2.practices.day2;

public class Task5 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        
        int wynik = 1;
        for (int i = 0; i < b; i++) {
            wynik = wynik * a;
        }
        System.out.print(wynik);
    }
}
