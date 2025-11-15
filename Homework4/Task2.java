package Homework4;

import java.util.Scanner;

public class Task2 {
     public static int sumOfDigits(int num) {
        if (num < 0) {
            num = -num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean sumOfNumbersInColumnIsEqual(int[][] matrix, int row, int column) {
        for (int j = 0; j < column; j++) {
            int sum1 = sumOfDigits(matrix[0][j]);
            boolean allRowIsEqual = true;
            for (int i = 1; i < row; i++) {
                if (sum1 != sumOfDigits(matrix[i][j])) {
                    allRowIsEqual = false;
                    break;
                }
            }
            if (allRowIsEqual) {
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
        boolean result = hasSameSumColumn(matrix);
        System.out.println("есть столбец с одинаковой суммой цифр: " + result);
    }
}