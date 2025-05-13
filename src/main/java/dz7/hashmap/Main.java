package dz7.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        HashMap<String,Integer> people = new HashMap<>();
        people.put("Иван",45);
        people.put("Кирилл",95);
        people.put("Артур",35);
        people.put("Ксения",25);
        people.put("Алла",65);
        System.out.println("Список людей ( Имя -> возраст):");
        for (Map.Entry<String,Integer> entry : people.entrySet()){
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name +":"+ age+ "лет");

         */
        HashMap<String,Integer> people = new HashMap<>();
        people.put("Иван",45);
        people.put("Кирилл",95);
        people.put("Артур",35);
        people.put("Ксения",25);
        people.put("Алла",65);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для поиска:");
        String searchName = scanner.nextLine();
        if (people.containsKey(searchName)){
            int age =people.get(searchName);
            System.out.println("Найдено! Возраст :"+age +"лет.");}
        else {
            System.out.println("Не найдено");
        }
        scanner.close();
    }
}
