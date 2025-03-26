package dz7.treeset;

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        /*
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        System.out.println("TreeSet после добавления:" + numbers);
        System.out.println("\nЭлементы по порядку:");
        for (int num : numbers)
            System.out.println(num);

         */
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        addUnique(numbers, 15);
        addUnique(numbers, 20);
        System.out.println("Итоговый TreeSet:" + numbers);
    }

    public static void addUnique(TreeSet<Integer> set, int number) {
        if (set.add(number)) {
            System.out.println("Число " + number + " добавлено.");

        } else {
            System.out.println("число " + number + "  уже существует!");
        }
    }


}
