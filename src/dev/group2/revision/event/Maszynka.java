package dev.group2.revision.event;

public class Maszynka {

    private Uzytkownik[] uzytkownicy;
    private Bilet[] bilets;

    public Maszynka(Uzytkownik[] uzytkownicy, Bilet[] bilets) {
        this.uzytkownicy = uzytkownicy;
        this.bilets = bilets;
    }

    public Bilet mojBilet(String imie, String nazwisko)
            throws UzytkownikNieIstnieje {
        // znajdz numer uzytkownika

        int nrUzytkownika = nrUzytkownika(imie, nazwisko);

        // na podstawie numeru znajdz bilet
        if (nrUzytkownika != -1) {
            return bilet(nrUzytkownika);
        } else {
            return null;
        }
    }

    private Bilet bilet(int nrUzytkownika) {
        for (int i = 0; i < bilets.length; i++) {
            if (bilets[i].nrUzytkownika == nrUzytkownika) {
                return bilets[i];
            }
        }
        return null;
    }


    private int nrUzytkownika(String imie, String nazwisko)
            throws UzytkownikNieIstnieje {
        for (int i = 0; i < uzytkownicy.length; i++) {
            if (uzytkownicy[i].imie.equals(imie) &&
            uzytkownicy[i].nazwisko.equals(nazwisko)) {
                return uzytkownicy[i].nr;
            }
        }
        throw new UzytkownikNieIstnieje(imie, nazwisko);
    }
}

class UzytkownikNieIstnieje extends Exception {

    public final String napis;

    UzytkownikNieIstnieje(String imie, String nazwisko) {
        this.napis = imie + " " +nazwisko;
    }
}
