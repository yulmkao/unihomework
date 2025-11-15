package Classwork5;

import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текст:");
        String text = scanner.nextLine();
        while (true) {
            System.out.println("выберите действие:");
            System.out.println("1. найти подстроку");
            System.out.println("2. разбить строку на слова");
            System.out.println("0. выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("введите подстроку:");
                    String substring = scanner.nextLine();
                    int position = findSubstring(text, substring);
                    if (position >= 0) {
                        System.out.println("найдено в позиции: " + position);
                    } else {
                        System.out.println("подстрока не найдена");
                    }
                    break;
                case "2":
                    String[] words = splitWords(text);
                    System.out.println("слова: ");
                    for (int i = 0; i < words.length; i++) {
                        System.out.println(words[i]);
                    }
                    break;
                case "0":
                    System.out.println("выход из программы");
                    return;
                default:
                    System.out.println("неверный выбор, попробуйте еще раз");
            }
        }
    }

    public static int findSubstring(String text, String sub) {
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    public static String[] splitWords(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        count++;
        String[] words = new String[count];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index] = word;
                index++;
                word = "";
            }
        }
        words[index] = word;
        return words;
    }
}