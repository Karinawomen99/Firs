package dz13.Seconde;

import java.util.regex.Pattern;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}

