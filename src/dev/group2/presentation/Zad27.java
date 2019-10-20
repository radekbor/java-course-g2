package dev.group2.presentation;

public class Zad27 {
    public static void main(String[] args) {

        System.out.println(Planety.Ziemia);
        System.out.println(Planety.Ziemia.size);
    }
}

enum Planety {
    Ziemia(20), Jowisz(30) {
        @Override
        public String toString() {
            return super.toString();
        }
    }, Mercury(20) {
        @Override
        public String toString() {
            return super.toString();
        }
    };

    public final int size;

    Planety(int size) {
        this.size = size;
//        this.name()
    }

    @Override
    public String toString() {
        return this.name() + " " + this.size;
    }
}
