package dz7.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*
        ArrayList<Integer>numbers= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        numbers.add(60);
        System.out.println("Список чисел:"+numbers);

         */
        /*
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66));
        System.out.println("Четные числа;");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);

         */
        ArrayList<String>strings = new ArrayList<>(Arrays.asList("Яблоко","Банан","Апельсин","Груша","Арбуз"));
        String longest = "";
        for(String str: strings) {
            if (str.length()> longest.length()) {
                longest =str;
                System.out.println("Самая длинная строка :"+ longest);
            }
        }
    }
}
