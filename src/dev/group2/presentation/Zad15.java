package dev.group2.presentation;


public class Zad15 {


    public static void main(String[] args) {
        Bottle b = new Bottle();

        System.out.println(b.capacity);
        System.out.println(b.currentLevel);
    }
}

class Bottle {
    int capacity;
    int currentLevel;
}

