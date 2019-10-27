package dev.group2.revision.event;

public class Bilet {



    public final int cena;
    public final int nrUzytkownika;
    public final Miejsce miejsce;

    public Bilet(int cena, int nrUzytkownika, Miejsce miejsce) {
        this.cena = cena;
        this.nrUzytkownika = nrUzytkownika;
        this.miejsce = miejsce;
    }
}
