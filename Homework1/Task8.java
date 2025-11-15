package Homework1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите цифру: ");
        int k = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + k + " = " + k * i);
        }
    }
}