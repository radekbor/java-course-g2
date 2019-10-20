package dev.group2.presentation;

public class Zad25 {

    public static void main(String[] args) {
        Runner r = new Sportsman();
        r.run(2);
    }
}


interface Runner {
    void run(int m);
}
interface Thrower {
    void throwSth();
}

interface MarathonRunner {
    void run(int m);
}
class Sportsman implements Runner, Thrower, MarathonRunner {

    @Override
    public void run(int m) {

    }

    @Override
    public void throwSth() {

    }
}