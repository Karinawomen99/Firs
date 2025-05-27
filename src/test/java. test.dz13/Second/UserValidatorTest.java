package Second;

import dz13.Seconde.InvalidUserException;
import dz13.Seconde.User;
import dz13.Seconde.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    private UserValidator validator;
    private User validUser;
    private User invalideUser;

    @BeforeEach
    public void setUp() {
        validator = new UserValidator();
        validUser = new User("Anna", 35, "anna@example.come");

    }

    // Проверка валидного пользователя
    @Test
    public void validate_shouldPasssForValidUser() {
        assertDoesNotThrow(() -> validator.validate(validUser));
    }

    // проверка пустого имени
    @Test
    public void validate_shouldTrowIfNameIsEmpty() {
        User user = new User("", 35, "ghfbfyh@mail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));

    }

    // проверка возраст<18
    @Test
    public void validate_shouldIdTrowIfAgeUnder18() {
        User user = new User("Jon", 17, "jon@mail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    // проверка некорректного email
    @Test
    public void validate_shouldIdTrowIfEmailInvalid() {
        User user = new User("Pop", 89, "iuioe-enai");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }
    // Проверка отклонённой валидации


    @Test
    public void validate_shoulSkipCheckIfDisable() {
        validator.setValidationEnabled(false);
        User user = new User("", 0, "ioenek-email");
        assertDoesNotThrow(() -> validator.validate(invalideUser));
    }
}

