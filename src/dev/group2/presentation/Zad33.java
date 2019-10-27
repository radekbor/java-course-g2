package dev.group2.presentation;

public class Zad33 {


    public static void main(String[] args) {
        MyPair<Integer, String> pair = new MyPair<>(10, "String");


    }
}


class MyPair<T1, T2> {

    T1 a;
    T2 b;
    MyPair(T1 t1, T2 t2) {
        this.a = t1;
        this.b = t2;
    }
}