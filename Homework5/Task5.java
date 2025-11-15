package Homework5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("введите количество столбцов: ");
        int column = scanner.nextInt();
        String[][] matrix = new String[row][column];
        scanner.nextLine();
        int number = 1;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("введите элемент " + number + ": ");
                matrix[i][j] = scanner.nextLine();
                number++;
            }
        }
        String[][] transposedMatrix = new String[column][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("исходная матрица:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("перевернутая матрица:");
        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}