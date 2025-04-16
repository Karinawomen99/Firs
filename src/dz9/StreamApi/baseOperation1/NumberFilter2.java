package dz9.StreamApi.baseOperation1;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,3,15,22,25,30,7);
        List<Integer> filterNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Числа кртаные 5 :"+filterNumbers);
    }
}
