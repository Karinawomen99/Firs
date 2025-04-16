package dz9.StreamApiOperation;

import java.util.List;
import java.util.Optional;

public class MaxNumber1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,12,3,24,7,15);
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        maxNumber.ifPresent(max->System.out.println( "Максимальное число :"+ max));
    }
}
