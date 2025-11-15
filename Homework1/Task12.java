package Homework1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число: ");
        int number = scanner.nextInt();
        String result = "";
        while (number > 0) {
            int ostatok = number % 2;
            result = ostatok + result;
            number /= 2;
        }
        System.out.println("результат в двоичной системе счисления: " + result);
    }
}