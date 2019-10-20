package dev.group2.presentation;

public class Zad24 {

    public static void main(String[] args) {

    }
}

class Osoba {
    public Osoba(String imie) {
        this.imie = imie;
    }

    String imie;
}

class Uczen extends Osoba {

    public Uczen(String imie) {
        super(imie);
    }
}
