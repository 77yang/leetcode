package com.yang7.jdk;

import java.util.PriorityQueue;

public class Test {

    public static void main(String[] args) {
        priority();
    }

    private static void priority() {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);

        priorityQueue.add(2);

        priorityQueue.add(7);

        priorityQueue.add(3);

        priorityQueue.add(5);

        priorityQueue.add(9);
        priorityQueue.add(10);
        priorityQueue.add(6);
        System.out.println(priorityQueue);
        priorityQueue.add(-1);
        System.out.println(priorityQueue);


    }


}
