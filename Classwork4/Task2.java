package Classwork4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            for (int j = 0; j < vowels.length(); j++){
                if (c == vowels.charAt(j)){
                    count++;
                    break;
                }
            }
        }  
        if (count == 3) {
            flag = true;
        }
        System.out.println(flag);
    }
}