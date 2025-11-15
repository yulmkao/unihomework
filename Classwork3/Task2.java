package Classwork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("инвертированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}