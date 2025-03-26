package dz7.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicatesExample {
    public static Set<String> removeDuplicates(List<String> input) {
        Set<String> uniqueSet = new HashSet<>(input);
        return uniqueSet;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Иван");
        names.add("Анна"); // Дубликат
        names.add("Мария");
        names.add("Иван"); // Дубликат
        names.add("Петр");

        System.out.println("Исходный список с дубликатами: " + names);

        // Удаляем дубликаты с помощью нашего метода
        Set<String> uniqueNames = removeDuplicates(names);

        System.out.println("Список без дубликатов: " + uniqueNames);
    }
}
