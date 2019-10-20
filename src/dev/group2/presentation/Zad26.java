package dev.group2.presentation;

public class Zad26 {

    public static void main(String[] args) {

        House h = new FlatRoofHouse(10, 12);
        System.out.println(h.cubicCapacity());
    }
}

abstract class House {

    abstract int cubicCapacity();
}

class FlatRoofHouse extends House {

    final int a;
    final int l;

    FlatRoofHouse(int a, int l) {
        this.a = a;
        this.l = l;
    }

    @Override
    int cubicCapacity() {
        return a*a*l;
    }
}

class CottageHouse extends House {

    final int a;
    final int l;
    final int h;

    CottageHouse(int a, int l, int h) {
        this.a = a;
        this.l = l;
        this.h = h;
    }

    @Override
    int cubicCapacity() {
        return a*a*l + a*a*h/2;
    }
}