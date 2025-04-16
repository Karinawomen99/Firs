package dz9.function;

import java.util.function.Function;

public class FunctionExample4 {
    public static void main(String[] args) {
        Function<String,Integer> lengthFunction = S -> S.length();
        int length1 =lengthFunction.apply(" текст ");
        int length2 =lengthFunction.apply("Hello world ");
        System.out.println("Длина слова 'текст': "+ length1);
        System.out.println("Длина фразы 'Hello world ': "+ length2);
    }
}
