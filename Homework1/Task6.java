package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x: ");
        double x = scanner.nextDouble();
        System.out.println("введите y: ");
        double y = scanner.nextDouble();
        System.out.println("введите n: ");
        int n = scanner.nextInt();
        if (x * x + y * y <= n * n) {
            System.out.println("точка лежит в окружности");
        } else {
            System.out.println("точка не лежит в окружности");
        }
    }
}