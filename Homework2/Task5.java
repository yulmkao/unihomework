package Homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" * ");
            }
            factorial *= i;
            System.out.print(i);
        }
        System.out.println(" = " + factorial);
    }
}