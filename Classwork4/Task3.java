package Classwork4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiouAEIOU"; 
        System.out.print("введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("введие количество столбцов: ");
        int columns = scanner.nextInt();
        String[][] matrix = new String[rows][columns];
        int count = 0;
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("введите элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.next();
            }
        }

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (vowels.contains(matrix[i][j].charAt(0) + "")) {
                    count++;
                }
            }
            if (count >= 1) {
                result++;
            }
            count = 0;
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        if (result == columns) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}