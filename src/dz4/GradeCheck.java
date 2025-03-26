package dz4;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ВВедите оценку (1-5):");
        int grade = scanner.nextInt();
        if (grade == 5) {
            System.out.println("Отлично");
        } else if (grade == 4) {
            System.out.println("Хорошо");
        } else if (grade == 3) {
            System.out.println("Удовлетворительно");
        } else if (grade == 2 || grade == 1) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Некорректная оценка");


        }
    }
}



