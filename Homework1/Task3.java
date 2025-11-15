package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("введите второе число: ");
        double number2 = scanner.nextDouble();
        System.out.println("введите третье число: ");
        double number3 = scanner.nextDouble();
        if (number1 > number2 && number1 > number3) {
            System.out.println("число " + number1 + " максимальное");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("число " + number2 + " максимальное");
        } else {
            System.out.println("число " + number3 + " максимальное");
        }
    }
}