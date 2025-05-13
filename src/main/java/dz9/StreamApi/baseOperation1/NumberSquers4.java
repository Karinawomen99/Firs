package dz9.StreamApi.baseOperation1;

import java.util.List;
import java.util.stream.Collectors;

public class NumberSquers4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> squers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Квадраты чисел :"+ squers );
    }
}
