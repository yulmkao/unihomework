package Homework1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число: ");
        int number = scanner.nextInt();
        int digit = 1;
        String result = "";
        while (number > 0) {
            int newNumber = number % 10;
            if (newNumber * digit != 0) {
                if (!result.isEmpty()) {
                    result = newNumber * digit + " + " + result;
                } else {
                    result = newNumber * digit + result;
                }
            }
            number /= 10;
            digit *= 10;
        }
        System.out.println(result);
    }
}