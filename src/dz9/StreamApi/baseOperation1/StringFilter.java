package dz9.StreamApi.baseOperation1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> strings =List.of("Java","Stream" ,"API", "Пример","Фильтрация","Код");
        List<String> filterStrings = strings.stream()
                .filter(s-> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Отфильтрованные строки :"+ filterStrings );
    }

}
