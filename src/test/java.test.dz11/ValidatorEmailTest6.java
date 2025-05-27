import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorEmailTest6 {

    public boolean isValidEmail(String email) {
        return email != null &&
                email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    @ParameterizedTest(name = "Корректный email: {0}")
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc",

    })
    void testValidEmails(String email) {
        assertTrue(isValidEmail(email));
    }

    @ParameterizedTest(name = "Некорректный email: {0}")
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "@-user.com",
            "user@domain",
            "",
            "user@.com",

    })
    void testInvalidEmails(String email) {
        assertFalse(isValidEmail(email));
    }

    @Test
    void testNullEmail() {
        assertFalse(isValidEmail(null));
    }
}
