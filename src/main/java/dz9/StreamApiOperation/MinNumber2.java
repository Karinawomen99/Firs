package dz9.StreamApiOperation;

import java.util.List;
import java.util.Optional;

public class MinNumber2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,45,2,54,6,2);
        Optional<Integer> minNumber = numbers.stream().min(Integer ::compareTo);
        minNumber.ifPresent(min->System.out.println("Минимальное число :"+min));
    }
}
