package Homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите n: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int center = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int distI = center - i;
                if (distI < 0) {
                    distI = -distI;
                }
                int distJ = center - j;
                if (distJ < 0) {
                    distJ = -distJ;
                }
                if (distI + distJ <= center) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}