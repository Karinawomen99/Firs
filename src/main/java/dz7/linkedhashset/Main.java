package dz7.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        /*
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Яблоко");
        linkedHashSet.add("Груша");
        linkedHashSet.add("Тыква");
        linkedHashSet.add("Дыня");
        linkedHashSet.add("Огурец");
        System.out.println("Содержимое LinkedHashSet");
        System.out.println(linkedHashSet);
        System.out.println( "\nВывод через for-each:");
        for (String fruit : linkedHashSet){
            System.out.println(fruit);

         */
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Сюзанна");
        names.add("Катерина");
        names.add("Александр");
        addUnique( names, " Анастасия");
        addUnique( names, "Сюзанна");
        System.out.println("Обновленный LinkedHashSet: "+ names);
        }

    private static void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)){
            set.add(element);
            System.out.println("Элемент "+element+" успешно добавлен.");}
        else {
            System.out.println("Элемент "+element+ "уже существует , добавление отменено.");
    }
}
}
