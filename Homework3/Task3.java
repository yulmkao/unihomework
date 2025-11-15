package Homework3;

import java.util.Scanner;

public class Task3 {
    public static boolean sumOfNumbersInRowIsDiv5(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                if (num < 0) {
                    num = -num;
                }
                int sum = 0;
                while (num > 0) {
                    int temp = num % 10;
                    sum += temp;
                    num /= 10;
                }
                if (sum % 5 == 0) {
                    count++;
                }
            }
            if (count < 2) {
                return false;
            }
        }
        return true;
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
        boolean result = sumOfNumbersInRowIsDiv5(matrix);
        System.out.println("есть не менее двух чисел, сумма цифр которых делится на 5: " + result);
    }
}