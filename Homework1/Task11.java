package Homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число в двоичной системе счисления: ");
        int number = scanner.nextInt();
        int number2 = 0;
        int digit = 1;
        
        while (number > 0) {
            int chislo = number % 10;
            number2 += chislo * digit;
            number /= 10;
            digit *= 2;
        }
        System.out.println("результат в десятичной системе счисления: " + number2);
    }
}