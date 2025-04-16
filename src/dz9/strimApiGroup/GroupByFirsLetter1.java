package dz9.strimApiGroup;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirsLetter1 {
    public static void main(String[] args) {
        List<String> words = List.of("Яблоко","Груша","Банан","Абрикос","Броколли" ,"Апельсин");
        Map<Character, List<String>> groupedByLetter = (Map<Character, List<String>>) words.stream()
                .collect(Collectors.groupingBy(word ->word.charAt(0)
                ));
        groupedByLetter.forEach((letter, wordList)->
        {
            System.out.println("Буква "+letter +":"+wordList);});


    }
}
