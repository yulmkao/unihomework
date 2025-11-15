package Classwork3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите количество строк n: ");
        int n = scanner.nextInt();
        System.out.print("введите количество столбцов m: ");
        int m = scanner.nextInt();
        int[][] original = new int[n][m];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                original[i][j] = scanner.nextInt();
            }
        }
        
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = original[i][j] * 2;
            }
        }

        System.out.println("исходный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("массив после умножения на 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(copy[i][j] + " ");
            }
            System.out.println();
        }
    }
}