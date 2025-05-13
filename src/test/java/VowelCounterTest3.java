import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VowelCounterTest3 {
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
    @ParameterizedTest(name = "Строка \"{0}\" содержит {1} гласных")
    @CsvSource({
            "hello, 2",
            "Java, 2",
            "AEIOU, 5",
            "TEST, 1",
            "12345, 0",
            "!@#$%, 0"
    })
    @DisplayName("Позитивные тесты для строк с гласными и без")
    void testCountVowelsPositive(String input, int expectedCount) {
        assertEquals(expectedCount, countVowels(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "   ", "bcdfg"})
    @DisplayName("Тесты для пустых строк и строк без гласных")
    void testCountVowelsEmptyAndNoVowels(String input) {
        assertEquals(0, countVowels(input));
    }

    @Test
    @DisplayName("Передача null должна вызывать исключение")
    void testCountVowelsWithNull() {
        assertThrows(IllegalArgumentException.class, () -> countVowels(null));
    }
}
