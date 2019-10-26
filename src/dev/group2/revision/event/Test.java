package dev.group2.revision.event;

public class Test {

    public static void main(String[] args) {

        Bilet b1 = new Bilet(10, 10,
                Miejsce.stworz(Strefa.A, 10));

        Bilet b2 = new Bilet(10, 11,
                Miejsce.stworz(Strefa.A, 11));

        Bilet b3 = new Bilet(10, 12,
                Miejsce.stworz(Strefa.A, 12));

        Uzytkownik u1 = new Uzytkownik(10, "Jan", "Kowalski");
        Uzytkownik u2 = new Uzytkownik(11, "Janina", "Kowalski");
        Uzytkownik u3 = new Uzytkownik(12, "Waldemar", "Kowalski");

        Maszynka maszynka = new Maszynka(
                new Uzytkownik[]{u1, u2, u3},
                new Bilet[]{b1, b2, b3}
        );

        Bilet f1 = maszynka.mojBilet("X", "Y");
        System.out.println(f1);

        Bilet f2 = maszynka.mojBilet("Jan", "Kowalski");
        System.out.println(f2);
    }
}
