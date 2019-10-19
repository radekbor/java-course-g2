package dev.group2.presentation;


public class Zad17 {
    

    public static void main(String[] args) {
        int initialCapacity = 10;
        BottleV3 b = new BottleV3(initialCapacity);

        System.out.println(b.isEmpty());
        b.currentLevel = 10;
        int x = 3;
        b.drink(x);
        System.out.println(b.currentLevel);
        b.makeEmpty();
        System.out.println(b.currentLevel);
    }
}

class BottleV3 {

    public BottleV3(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public BottleV3(int capacityAndCurrentLevel) {
        this(capacityAndCurrentLevel, capacityAndCurrentLevel);
    }

    public BottleV3() {
        this(20);
    }

    final int capacity;
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

