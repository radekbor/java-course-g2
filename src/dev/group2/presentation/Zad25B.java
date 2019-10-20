package dev.group2.presentation;

public class Zad25B {

    public static void main(String[] args) {


        Footballer f = new ProPlayer();
        f.kickBall();

        play(new AmateurPlayer());
        play(new ProPlayer());
    }

    static void play(Footballer footballer) {
        footballer.kickBall();
    }

}

interface Footballer {
    default void kickBall() {
        System.out.println("kickBall");
    }
}

class AmateurPlayer implements Footballer {

}

class ProPlayer implements Footballer {
    @Override
    public void kickBall() {
        System.out.println("ProPlayer.kickBall");
    }
}
