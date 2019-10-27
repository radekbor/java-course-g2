package dev.group2.presentation;

import java.util.HashSet;
import java.util.Set;

public class Zad36B {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);

        set.remove(1);
        System.out.println(set);


        Set<Cat> set2 = new HashSet<>();

        set2.add(new Cat("A"));
        set2.add(new Cat("A"));
        set2.add(new Cat("B"));

        System.out.println(set2);
    }


}

class Cat {

    final String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Cat) {
            Cat other = (Cat)obj;
            return this.name.equals(other.name);
        }
        return false;

    }
}