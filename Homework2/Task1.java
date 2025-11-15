package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите высоту прямоугольника m: ");
        int m = scanner.nextInt();
        System.out.print("введите ширину прямоугольника n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}