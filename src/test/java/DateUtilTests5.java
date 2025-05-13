import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateUtilTests5 {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
@ParameterizedTest(name = "Год {0} должен быть високосным")
    @ValueSource(ints = {2020,2000,1600,4})
     void testLeapYears(int year){
        assertTrue(isLeapYear(year));
}
@ParameterizedTest(name = "Год{0} не должен быть високосным")
    @ValueSource(ints = {2019,2021,1900,2100})
    void testNonLeapYears(int year){
        assertFalse(isLeapYear(year));
}
}

