package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("введите второе число: ");
        double number2 = scanner.nextDouble();
        String max = (number1 > number2) ? "максимальное число: " + number1 : "максимальное число: " + number2;
        System.out.println(max);
    }
}