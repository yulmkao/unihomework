package Classwork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("введите " + size + " числа: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean negative = false;
        for (int element : array) {
            if (element < 0) {
                negative = true;
                break;
            }
        }
        System.out.println("есть отрицательное число? " + negative);
    }
}