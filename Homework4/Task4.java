package Homework4;

import java.util.Scanner;

public class Task4 {
    public static boolean hasIncreasingDigits(int num) {
        if (num < 0) {
            num = -num;
        }
        int lastDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit >= lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            num /= 10;
        }
        return true;
    }

    public static boolean checkMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (hasIncreasingDigits(matrix[i][j])) {
                    count++;
                }
            }
            if (count != 2) {
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
        boolean result = checkMatrix(matrix);
        System.out.println("в каждой строке ровно два числа с возрастающими цифрами: " + result);
    }
}