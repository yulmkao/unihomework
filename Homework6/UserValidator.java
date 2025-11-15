package Homework6;

import java.util.Scanner;

public class UserValidator {
	public static boolean validateName(String name) {
		return name != null && name.matches("[А-ЯЁ][а-яё]{1,14}");
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("введите имя: ");
        String name = scanner.nextLine();
        if (validateName(name)) {
         	System.out.println("имя валидно");
        } else {
            System.out.println("имя невалидно");
       	}
    }
}