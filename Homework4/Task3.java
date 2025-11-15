package Homework4;

import java.util.Scanner;

public class Task3 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

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

    public static boolean checkMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean flag = false;
            for (int j = 0; j < matrix[i].length; j++) {
                int number = matrix[i][j];
                if (isPrime(number) && isPrime(sum(number))) { 
                    flag = true;
                    break;
                }
            }
            if (!flag) {
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
        System.out.println("есть хоят бы одно простое число у которого сумма чисел тоже простое число: " + result);
    }
}