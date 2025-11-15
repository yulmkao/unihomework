package Homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String wordWithMaxVowels = "";
        int maxVowelCount = 0;
        for (String word : words){
            word = word.toLowerCase();
            int vowelCount = 0;
            for (int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                if (letter == 'а' || letter == 'е' || letter == 'ё' || letter == 'и' || 
                    letter == 'о' || letter == 'у' || letter == 'ы' || letter == 'э' || 
                    letter == 'ю' || letter == 'я') {
                    vowelCount++;
                }
            }
            if (vowelCount > maxVowelCount){
                maxVowelCount = vowelCount;
                wordWithMaxVowels = word;
            }
        }
        System.out.println(wordWithMaxVowels);
    }
}