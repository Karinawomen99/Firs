package dz8.Exceptions2;

public class DivisionExample {
    public static void devideNumbers(int divident,int divisor){
        try {
            int result =divident/ divisor;
            System.out.println("Результат деления: "+result);
        }catch (ArithmeticException e){
            System.out.println("Ошибка : деление на ноль невозможно !");

        }
    }
    public static void main(String[] args){
        devideNumbers(10,2);// (5)
        devideNumbers(8,0); // вывод ошибки т.к на ноль делить нельзя

    }
}
