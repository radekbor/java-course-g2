package dev.group2.presentation;

import java.util.LinkedList;
import java.util.Queue;

public class Zad37B {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.remove());

    }
}
