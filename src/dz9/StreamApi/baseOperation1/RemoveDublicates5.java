package dz9.StreamApi.baseOperation1;

import dz2.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicates5 {
    public static void main(String[] args) {
        List<String> items = List.of("A","B","A","C","D","B");
        List<String> uniqueIteams = items.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Уникальные элементы :"+ uniqueIteams);
    }
}
