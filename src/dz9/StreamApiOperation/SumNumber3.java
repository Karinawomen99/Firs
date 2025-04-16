package dz9.StreamApiOperation;

import java.util.List;

public class SumNumber3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,2,3,4,2);
        int sum  = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма чисел :"+ sum);
    }
}
