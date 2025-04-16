package dz9.StreamApiOperation;

import java.util.List;
import java.util.Optional;

public class FirsStartWithB {
    public static void main(String[] args) {
        List<String> words = List.of("Яблоко","Банан","Огурец","Броколли");
        Optional<String> firsB =words.stream().filter(s -> s.startsWith("Б")).findFirst();
        firsB.ifPresentOrElse(word-> System.out.println("Первое слово на 'Б'"+ word),
                () -> System.out.println(" Слов на'Б'не найдено"));
    }
}
