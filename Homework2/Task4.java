package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int n = scanner.nextInt();
        int summa = 0;
        int stepen = 2;
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" + ");
            }
            System.out.print(stepen);
            summa += stepen;
            stepen *= 2;
        }
        System.out.println(" = " + summa);
    }
}