package dz9.function;
@FunctionalInterface
interface MathOperation {
    double operate (double a, double b);
}
public class Main1 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;//сложение
        MathOperation subtraction = (a, b) -> a - b;//вычитание
        MathOperation multiplication = (a, b) -> a * b;//умножение
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Делить на ноль!");
            }
            return a / b;//делапение
        };
        System.out.println("10 + 5 =" +addition.operate(10,5));
        System.out.println("10 - 5 =" +subtraction.operate(10,5));
        System.out.println("10 * 5 =" +multiplication.operate(10,5));
        System.out.println("10 / 5 =" +division.operate(10,5));
    }
}
