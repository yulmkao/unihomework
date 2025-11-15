package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("результат суммы: ");
        System.out.println(number1 + number2);
    }
}