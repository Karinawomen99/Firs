package dz4;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "password123";
        do {
            System.out.println("Введите пароль:");
            password = scanner.nextLine();
        }
        while (!password.equals(correctPassword));
        System.out.println(" Пароль верный!");
    }
}

