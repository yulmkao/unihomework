package Homework1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (true) {
            int newNumber = scanner.nextInt();
            if (newNumber < number) {
                break;
            }
            number = newNumber;
        }
    }
}