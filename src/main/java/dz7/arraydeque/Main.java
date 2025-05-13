package dz7.arraydeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        /*
       ArrayDeque<String> deque = new ArrayDeque<>();
       deque.add("Первый");
       deque.add("Второй");
       deque.add("Третий");
       deque.add("Четвертый");
       deque.add("Пятый");
       System.out.println("Cодержимое ArrayDeque :");

       for (String element : deque){
           System.out.println(element);

         */
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");
        stack.push("Четвертый");
        stack.push("Пятый");
        System.out.println("Содержимое стека перед извлечением"+stack);
        System.out.println("Элементы в порядке  извлечения(LIFO):");
        while (!stack.isEmpty()){
            // pop()
            String element = stack.pop();
            System.out.println(element);
       }
    }
}
