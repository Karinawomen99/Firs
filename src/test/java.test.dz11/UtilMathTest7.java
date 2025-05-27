import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UtilMathTest7 {

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    @ParameterizedTest(name = "Факториал{0} должен быть {1}")
    @CsvSource({
            "0,1",
            "1,1",
            "7,5040",
            "5,120"
    })
    void testFactirialPositive(int input,int expected){
        assertEquals(expected,factorial(input));
    }
    @ParameterizedTest(name = "Факториал от отрицательного числа{0} должны выбрасывать исключения")
    @CsvSource({
            "-1",
            "-5",
            "-100"
    })
    void testFactorialNegativeTrows(String input){
        int n = Integer.parseInt(input);
        assertThrows(IllegalAccessException.class,()->factorial(n));
    }
}
