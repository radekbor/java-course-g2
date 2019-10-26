package dev.group2.revision.event;






public class Miejsce {

    public final Strefa strefa;

    public final int nr;

    private Miejsce(Strefa strefa, int nr) {
        this.strefa = strefa;
        this.nr = nr;
    }

    public static Miejsce stworz(Strefa strefa, int nr) {
        if (nr >=0 && nr <= 100) {
            return new Miejsce(strefa, nr);
        } else {
            return null;
        }
    }
}
