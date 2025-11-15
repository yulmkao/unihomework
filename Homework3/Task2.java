package Homework3;

import java.util.Scanner;

public class Task2 {
    public static boolean AllNumbersIsDiv2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                boolean allEven = true;
                if (num < 0) {
                    num = -num;
                }
                if (num == 0) {
                    allEven = true;
                }
                while (num > 0) {
                    int temp = num % 10;
                    if (temp % 2 != 0) {
                        allEven = false;
                        break;
                    }
                    num /= 10;
                }
                if (allEven) {
                    count++;
                }
            }
            if (count != 1) {
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
        boolean result = AllNumbersIsDiv2(matrix);
        System.out.println("в каждой строке ровно одно число с только чётными цифрами?: " + result);
    }
}