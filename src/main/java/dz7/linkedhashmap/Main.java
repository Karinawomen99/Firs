package dz7.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        LinkedHashMap<String, Integer> fruits = new LinkedHashMap<>();
        fruits.put("Яблоко", 25);
        fruits.put("Груша", 95);
        fruits.put("Дыня", 345);
        fruits.put("Арбуз", 100);
        fruits.put("Авокадо", 125);
        fruits.put("Банан", 65);
        System.out.println("Фрукты и их количество");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue()+"шт.");

         */
        LinkedHashMap<String,String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Саша", "+7(898) 765 37-37");
        phoneBook.put("Юля", "+7(898) 263 37-37");
        phoneBook.put("Катя", "+7(898) 098 09-37");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для поиска:");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            String phone = phoneBook.get(name);
            System.out.println("Телефон:" + phone);

        } else {
            System.out.println("Контакт не найден.");
        }
        scanner.close();

    }
}

