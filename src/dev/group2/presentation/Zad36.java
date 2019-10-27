package dev.group2.presentation;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Zad36 {

    public static void main(String[] args) {

        Set<Student> set = new TreeSet<>(new StudentComparator());

        set.add(new Student(1, "Jan"));
        set.add(new Student(1, "Krystyna"));
        set.add(new Student(2, "Dawid"));

        System.out.println(set);


//        Set<Student> set2 = new TreeSet<>();
//        set2.add(new Student(1, "Jan"));
//        set2.add(new Student(1, "Krystyna"));
//        set2.add(new Student(2, "Dawid"));
//
//        System.out.println(set2);

        Set<Dog> set3 = new TreeSet<>();
        set3.add(new Dog("BC"));
        set3.add(new Dog("Ab"));
        set3.add(new Dog("Ab"));

        System.out.println(set3);
    }
}

class Dog implements Comparable<Dog> {

    final String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        /*
        -1 gdy o1 < o2
        0 o1 == o2
        1 o1 > o2
        if (o1.id < o2.id) {
            return -1;
        } else if (o1.id == o2.id){
            return 0;
        } else {
            return 1;
        }
         */
        return Integer.compare(o1.id, o2.id);
    }
}

class Student {

    final int id;
    final String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
