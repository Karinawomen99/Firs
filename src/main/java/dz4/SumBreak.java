package dz4;

import java.util.Scanner;

public class SumBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите число (или отрицательное число для выхода)");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Сумма введенных чисел :" + sum);
    }
}

