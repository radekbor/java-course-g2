package dev.group2.presentation;

public class Zad18 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 9);
        System.out.println(r1.a + " " + r1.b);

        Rectangle r2 = new Rectangle(10);
        System.out.println(r2.a + " " + r2.b);
    }
}

class Rectangle {

    final int a;
    final int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Rectangle(int a) {
        this(a, 5);
    }
}
