package dev.group2.presentation;


public class Zad16 {
    

    public static void main(String[] args) {
        BottleV2 b = new BottleV2();

        System.out.println(b.isEmpty());
        b.currentLevel = 10;
        int x = 3;
        b.drink(x);
        System.out.println(b.currentLevel);
        b.makeEmpty();
        System.out.println(b.currentLevel);
    }
}

class BottleV2 {

    int capacity;
    int currentLevel;

    boolean isEmpty() {
        return currentLevel == 0;
    }

    void makeEmpty() {
        currentLevel = 0;
    }

    void drink(int volume) {
        currentLevel -= volume;
    }
}

