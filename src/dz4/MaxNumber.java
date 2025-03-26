package dz4;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("ВВедите второе число:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Наибольшее число:" + num1);
        } else System.out.println("Наибольшее число :" + num2);
    }


}



