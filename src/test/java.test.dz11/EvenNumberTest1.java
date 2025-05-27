import org.junit.jupiter.api.Test;

import static com.example.dz11.EvenNumberChecker1.isEven;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumberTest1 {
    @Test
void testEvenPositiveNumber(){
    assertTrue (isEven(4), "4 должно быть чётным");
    assertTrue (isEven(10), "10 должно быть чётным");
    assertTrue (isEven(100), "100 должно быть чётным");
    }
    @Test
    void testOddPositiveNumber(){
        assertFalse(isEven(5),"5 должно быть нечётным");
        assertFalse(isEven(11),"11 должно быть нечётным");
        assertFalse(isEven(101),"101 должно быть нечётным");
    }
    @Test
    void testZero(){
        assertTrue(isEven(0),"0 должно быть чётным числом");
    }
    @Test
    void testEvenNedativeNumber(){
        assertTrue(isEven(-4),"-4 должно быть чётным числом ");
        assertTrue(isEven(-10),"-10 должно быть чётным числом ");
        assertTrue(isEven(-100),"-100 должно быть чётным числом ");
    }
    @Test
    void testOddNegativeNumber(){
        assertFalse(isEven(-5),"-5 должно быть нечётным числом");
        assertFalse(isEven(-11),"-11 должно быть нечётным числом");
        assertFalse(isEven(-101),"-101 должно быть нечётным числом");
    }
}
