package dz13.Seconde;

import java.util.regex.Pattern; /**
 * Сервис для валидации данных пользователя
 */
public class UserValidator {
    // Флаг, управляющий выполнением валидации
    private boolean validationEnabled = true;

    // Регулярное выражение для проверки email
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    /**
     * Устанавливает состояние валидации
     * @param enabled true - валидация включена, false - выключена
     */
    public void setValidationEnabled(boolean enabled) {
        this.validationEnabled = enabled;
    }

    /**
     * Проверяет валидность пользователя
     * @param user пользователь для проверки
     * @throws InvalidUserException если данные пользователя невалидны
     */
    public void validate(User user) {
        if (!validationEnabled) {
            return; // Валидация отключена - пропускаем проверки
        }

        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    /**
     * Проверяет валидность имени
     * @param name имя для проверки
     * @throws InvalidUserException если имя невалидно
     */
    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("Имя не может быть пустым");
        }

        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }
    }

    /**
     * Проверяет валидность возраста
     * @param age возраст для проверки
     * @throws InvalidUserException если возраст невалиден
     */
    private void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть от 18 до 100 лет");
        }
    }

    /**
     * Проверяет валидность email
     * @param email email для проверки
     * @throws InvalidUserException если email невалиден
     */
    private void validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidUserException("Email не может быть пустым");
        }

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidUserException("Email имеет неверный формат");
        }
    }
}
