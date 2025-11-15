package Homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите n: ");
        int n = scanner.nextInt();
        System.out.print("введите x: ");
        float x = scanner.nextFloat();
        double summa = 0;
        int factorial = 1;
        double stepen = x;
        for (int k = 1; k <= n ; k++) {
            factorial *= k;
            summa += factorial * stepen;
            stepen *= x;
        }
        System.out.println(summa);
    }
}