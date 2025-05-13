import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtialArrayTests8 {

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
    static Stream<org.junit.jupiter.params.provider.Arguments>secondMaxCases() {
        return Stream.of(org.junit.jupiter.params.provider.Arguments.of(new int[]{3, 5, 7, 2}, 5),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{10, 20}, 10),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{-3, -2, -1, -1}, -2));
    }
        @ParameterizedTest(name = "Второй максиму в {0} должен быть {1}")
        @MethodSource("secondMaxCases")
        void testFindSecondMaxPositive(int[]input, int expected)
        {
            assertEquals(expected,findSecondMax(input));

        }
        @Test
    void testFindSecondMaxDublicatesOnly(){
        int[]array ={4,4,4,4};
        assertThrows(NoSuchElementException.class,()->findSecondMax(array));
        }
        @Test
    void testFindSecondMaxWithOneElement(){
        int[] array = {54};
        assertThrows(NoSuchElementException.class,()->findSecondMax(array));
        }

    @Test
void testFindSecondMaxEmptyArray(){
    int[]array ={};
    assertThrows(NoSuchElementException.class,()->
            findSecondMax(array));
    }

}


