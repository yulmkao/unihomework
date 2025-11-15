package Homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x: ");
        double x = scanner.nextDouble();
        System.out.println("введите y: ");
        double y = scanner.nextDouble();
        for (int n = 1; n <= 10; n++) {
            if (x * x + y * y <= n * n) {
                System.out.println(n);
                break;
            } if (n == 10) {
                System.out.println("missed");
            }
        }
    }
}