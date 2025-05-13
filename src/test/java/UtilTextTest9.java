import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilTextTest9 {
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
@ParameterizedTest(name = "\"{0}\" содержит {1} слов")
    @CsvSource({
            "'Hello Karina',2",
            "'Work and travel' ,3",
            "'banana and', 2 ",
            " '',0",
            "'  ',0"
    })
    void testCountWordPositive(String input, int expected){
        assertEquals(expected,countWords(input));

    }
    @Test
    void testCountWordsWithNull(){
        assertThrows(IllegalArgumentException.class,()->countWords(null));

    }
}
