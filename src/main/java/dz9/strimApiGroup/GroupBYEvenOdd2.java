package dz9.strimApiGroup;

import dz2.Laptop;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBYEvenOdd2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<String , List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n-> n % 2== 0? "Четные":"Нечетные"));
        groupedNumbers.forEach((key, numberList)->{
            System.out.println(key+":"+numberList);
        });
    }
}
