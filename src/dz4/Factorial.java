package dz4;

import java.util.Scanner;

public class Factorial {public static void main(String []args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("ведите число:");
    int n =scanner.nextInt();
    int factorial = 1;
    int i = 1;
    while (i <= n){
        factorial *= i;
        i++;
    }
    System.out.println( "Факториал числа " + n + ":"+ factorial);
}
}
