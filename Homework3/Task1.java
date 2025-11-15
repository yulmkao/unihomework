package Homework3;

import java.util.Scanner;

public class Task1 {
    public static boolean ColumnIsDiv3(int[][] matrix, int row, int column) {
        for (int j = 0; j < column; j++) {
            boolean allDiv3 = true;
            for (int i = 0; i < row; i++) {
                int num = matrix[i][j];
                if (num % 3 != 0) {
                    allDiv3 = false;
                    break;
                }
            }
            if (allDiv3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество строк: ");
        int row = scanner.nextInt();
        System.out.println("введите количество столбцов: ");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("введите число для индекса [" + i + "] [" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean result = ColumnIsDiv3(matrix, row, column);
        System.out.println("есть ли столбец делящийся на 3: "  + result);
    }
}