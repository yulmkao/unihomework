package Classwork4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++){
                if (c == vowels.charAt(j)){
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}