package Homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int size = 2;
        String[][] matrix = new String[size][size];
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("Введите " + number + " слово: ");
                matrix[i][j] = scanner.nextLine();
                number++;
            }
        }
        boolean allColumnsHaveVowel = true;
        for (int j = 0; j < size; j++){
            boolean columnHasVowel = false;
            for (int i = 0; i < size; i++){
                String word = matrix[i][j].toLowerCase();
                char lastLetter = word.charAt(word.length() - 1);
                if (lastLetter == 'а' || lastLetter == 'е' || lastLetter == 'ё' || lastLetter == 'и' ||
                        lastLetter == 'о' || lastLetter == 'у' || lastLetter == 'ы' || lastLetter == 'э' ||
                        lastLetter == 'ю' || lastLetter == 'я') {
                    columnHasVowel = true;
                    break;
                }
            }
            if (!columnHasVowel){
                allColumnsHaveVowel = false;
                break;
            }
        }
        System.out.println(allColumnsHaveVowel);
    }
}