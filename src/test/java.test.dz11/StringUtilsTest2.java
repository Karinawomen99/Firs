import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest2 {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
    @ParameterizedTest(name = "Разворот строки \"{0}\"должен быть \"{1}\"")
    @CsvSource({
            "hello, olleh",
            "Java ,avaJ",
            "12345,54321",
            "a,a",
            "Тест, тсеТ",
            "Space, ecapS"
    })
    @DisplayName("Позитивные тесты для разных строк")
    void testReversePositive(String input,String expected){
        assertEquals(expected,reverse(input));
    }
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "  "})
    @DisplayName("Тесты для пустых строк и пробелов")
    void  testReverseEmtyAndWhitespase(String input){
        assertEquals(input,reverse(input));
    }
    @Test
    @DisplayName("Передача nukk  должна вовращать nell")
    void testReverseWithNull(){
        assertNull(reverse(null));
    }
}
