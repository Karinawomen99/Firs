package dz9.StreamApi.baseOperation1;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengths3 {
    public static void main(String[] args) {
        List<String> strings = List.of("Java","Stream","API","програмирование");
        List<Integer> length = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Длины строк :"+length);

    }
}
