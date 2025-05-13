package dz7.priorityqueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(340);
        numbers.add(330);
        numbers.add(320);
        numbers.add(90);
        System.out.println("Исходная очередь "+ numbers);
        System.out.println("Элементы в порядке извлечения ");
        while (!numbers.isEmpty()){
            // poll();
            int num = numbers.poll();
            System.out.println(num);
        }
    }
}
