package dz4;

import java.util.Scanner;

public class SumOfNumbers { public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println( "Ведите число n:");
    int n = scanner.nextInt();
    int sum =0 ;
    for (int i =1; i <= n; i++) {
        sum += i;
    }
    System.out.println( "Cумма чисел от1 до " +n + ":"+ sum);
}

}
