package dz9.function;

import java.util.function.Predicate;

public class PredicateExample3 {

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("10 is even ?" + isEven.test(10));// true
        System.out.println("7 is even ?" + isEven.test(7));// false
        System.out.println( "Even numbers between 1 and 10");
        for (int i = 1;i <= 10; i++ ){
            if(isEven.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
