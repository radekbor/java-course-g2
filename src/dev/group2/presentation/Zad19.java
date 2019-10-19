package dev.group2.presentation;

public class Zad19 {

    public static void main(String[] args) {
        Worker w1 = new Worker("A");
        Worker w2 = new Worker("B");
        
        w1.msg1();
        w2.msg1();

        Worker.msg2();
        w1.msg2();

        w1.msg3();
    }
}

class Worker {

    static int counter;
    String name;

    Worker(String name) {
        this.name = name;
        counter++;
    }

    void msg1() {
        System.out.println("Razem ze mną pracuje " + (counter-1)+ " ludzi");
    }

    static void msg2() {
        System.out.println("Łącznie jest " + counter + " pracowników");
    }

    void msg3() {
        msg2();
    }
}