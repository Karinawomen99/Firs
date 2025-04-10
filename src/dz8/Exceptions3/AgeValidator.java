package dz8.Exceptions3;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidalAgeException {
        if (age < 0){// проверка на отрицательный возраст
            throw new InvalidalAgeException("Возраст не может быть отрицательным!");
        }
        if (age > 150){ // проврка на слишком большой возраст
            throw  new InvalidalAgeException(" Возраст не может быть больше 150 лет!");

        }
        System.out.println(" Возраст"+ age+ "корректен");
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5);
            validateAge(155);
        } catch (InvalidalAgeException e) {
            System.out.println("Ошибка:"+ e.getMessage());
        }
    }
}
