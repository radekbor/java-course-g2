package dev.group2.practices.day3;

public class Student {

    private Marks[] marks = new Marks[5];

    void dostajeOcene(Marks mark, int id) {
        marks[id] = mark;
    }

    public double srednia() {

        double sum = 0;
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == null) {
                return 0;
            } else {
                sum += marks[i].value;
            }
        }
        return sum / marks.length;
    }
}
