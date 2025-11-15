package Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("введите второе число: ");
        double number2 = scanner.nextDouble();
        if (number1 == number2) {
            System.out.println("числа равны между собой");
        } else {
            System.out.println("неа не равны");
        }
    }
}