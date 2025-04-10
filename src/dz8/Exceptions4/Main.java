package dz8.Exceptions4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message){
        super(message);
    }
}
public class Main {
    public static void validateEmail (String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+ [a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Неверный фрормат email :" + email);
        }
        System.out.println("Email валиден :" + email);
    }

    public static void main(String[] args) {
        try {
            validateEmail("invalidnail.come");
        }  catch (InvalidEmailException e){
            System.out.println( e.getMessage());

        }


    }
}
