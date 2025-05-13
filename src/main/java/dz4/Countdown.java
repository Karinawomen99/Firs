package dz4;

import java.util.Scanner;

public class Countdown {public static void main(String []args){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Введите положительное число :");
    int n = scanner.nextInt();
    while (n >= 1){
        System.out.println(n);
        n--;// декримент уменьшение значений на 1
    }
}
}
