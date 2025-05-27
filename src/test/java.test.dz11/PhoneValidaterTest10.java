import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneValidaterTest10 {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
    @ParameterizedTest(name = "Валидный номер{0}")
    @ValueSource(strings = {
            "+1 1234567890",
            "+7 1234567890",
            "+999 8788789708"
    })
    void testValidPhoneNumbers(String phone){
        assertTrue(isValidPhoneNumber(phone));
    }
    @ParameterizedTest(name = "Невалидный номер:{0}")
    @ValueSource(strings = {
            "12345",
            "",
            "fgeif",
            "+7 gygih",
            "+65858699",
            "+7 690"
    })
    void testInvalidPhoneNumbers(String phone){
        assertFalse(isValidPhoneNumber(phone));
    }
}
