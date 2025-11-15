package Classwork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("введите " + size + " числа: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("максимальное число: " + max);
    }
