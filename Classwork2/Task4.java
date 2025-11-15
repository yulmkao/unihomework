package Classwork2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("введите " + size + " числа: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int element : array) {
            if (element < 0) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println("отрицательных числе больше двух");
        } else {
            System.out.println("отрицательных чисел меньше двух");
        }
    }
}