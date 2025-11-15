package Classwork2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("введите размер 1 массива: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.print("введите " + size1 + " числа: ");
        for (int i = 0; i < size1; i++) {
        	array1[i] = scanner.nextInt();
        }
        System.out.print("введите размер 2 массива: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.print("введите " + size2 + " числа: ");
        for (int i = 0; i < size2; i++) {
        	array2[i] = scanner.nextInt();
        }
        boolean equal = true;
        if (size1 != size2) {
        	equal = false;
        } else {
            for (int i = 0; i < size1; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal);
    }
}