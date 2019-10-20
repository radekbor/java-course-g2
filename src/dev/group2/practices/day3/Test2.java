package dev.group2.practices.day3;

public class Test2 {

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.srednia());

        s1.dostajeOcene(Marks.A, 0);
        s1.dostajeOcene(Marks.B, 1);
        s1.dostajeOcene(Marks.C, 2);
        s1.dostajeOcene(Marks.A, 3);

        System.out.println(s1.srednia());

        s1.dostajeOcene(Marks.A, 4);
        System.out.println(s1.srednia());


    }
}
