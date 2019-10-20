package dev.group2.revision.fig;

public class Prostokat extends Wielokat {

    public final int a;
    public final int b;

    Prostokat(int a, int b) {
        super(4);
        this.a = a;
        this.b = b;
    }

    @Override
    public double obowd() {
        return a*2 + b*2;
    }

    @Override
    public double pole() {
        return a*b;
    }
}
