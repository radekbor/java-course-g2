package dev.group2.practices.day3;


class Rectangle extends Shape {

    final int a;
    final int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double pole() {
        return a * b;
    }

    @Override
    double obwod() {
        return a + a + b + b;
    }
}
