import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtTests {
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
    static Stream<org.junit.jupiter.params.provider.Arguments>maxCases() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new int[]{3, 5, 7, 2}, 7),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{1}, 1),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }
        @ParameterizedTest(name = "Максисмум в массиве {0} должен быть{1}")
        @MethodSource("maxCases")
        void testFindMaxPositive(int[] input,int expected){
            assertEquals(expected,findMax(input));
        }
        @Test
     @DisplayName("Пустой массив должен выбрасывать NoSuchElementExpection")
    void testFindMaxEmptyArray(){
        assertThrows(NoSuchElementException.class,()->findMax(new int[]{}));
    }
    }

