package Homework1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x: ");
        double x = scanner.nextDouble();
        System.out.println("введите y: ");
        double y = scanner.nextDouble();
        System.out.println("введите n: ");
        int n = scanner.nextInt();
        if ((-n/2 <= x && x <= n/2) && (-n/2 <= y && y <= n/2)) {
            System.out.println("точка лежит в квадрате");
        } else {
            System.out.println("точка не лежит в квадрате");
        }
    }
}