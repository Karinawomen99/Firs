package dz7.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        LinkedList<String>list =new LinkedList<>();
        list.add("Яблоко");
        list.add("Банан");
        list.add("Груша");
        list.add("Апельсин");
        list.add("Арбуз");
        System.out.println("Элементы списка:"+list);

         */
        /*
        LinkedList<String> tasks =new LinkedList<>();
        tasks.add("Задача 1: Позвонить клиенту");
        tasks.add("Задача 2: Отправить подарок");
        tasks.add("Задача 3: Проверить почту");

        while (!tasks.isEmpty()){
            String task = tasks.poll();
            System.out.println("Обрабатывается:"+ task);
            */

        LinkedList<String>list =new LinkedList<>();
        list.add("Яблоко");
        list.add("Груша");
        list.add("Дыня");
        list.add("Арбуз");
        if(!list.isEmpty()) {
            String firsElement = list.getFirst();
            String lastElement = list.getLast();
            System.out.println("Первый элемент:" + firsElement);
            System.out.println("Последний  элемент:" + lastElement);}
        else {
            System.out.println("Список пуст.");
        }
    }
}
