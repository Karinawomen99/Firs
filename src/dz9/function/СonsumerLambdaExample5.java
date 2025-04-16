package dz9.function;

import java.util.function.Consumer;

public class СonsumerLambdaExample5 {
    public static void main(String[] args) {
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Привет");
        printConsumer.accept("Это пример Consumer");
        Consumer<String > upperCaseConsumer  =s -> System.out.println(s.toUpperCase());
        upperCaseConsumer.accept( " пример в верхнем регистре ");
    }
}
