package Homework1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
           sum += number % 10;
           number /= 10;
        }
        System.out.println("сумма будет равна: " + sum);
    }
}