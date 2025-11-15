package Homework5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "").replace(",", "")
                .replace(".", "").replace("!", "")
                .replace("?", "").replace("-", "").toLowerCase();
        boolean flag = true;
        for (int i = 0 ; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}