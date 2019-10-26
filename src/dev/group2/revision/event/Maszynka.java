package dev.group2.revision.event;

public class Maszynka {

    private Uzytkownika[] uzytkownicy;
    private Bilet[] bilets;

    public Maszynka(Uzytkownika[] uzytkownicy, Bilet[] bilets) {
        this.uzytkownicy = uzytkownicy;
        this.bilets = bilets;
    }

    public Bilet mojBilet(String imie, String nazwisko) {
        // znajdz numer uzytkownika
        // na podstawie numeru znajdz bilet
    }
}
