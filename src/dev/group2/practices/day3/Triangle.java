package dev.group2.practices.day3;

public class Triangle extends Shape {

    final int a;
    final int b;
    final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double pole() {
        return 0;
    }

    @Override
    double obwod() {
        return a+b+c;
    }
}
