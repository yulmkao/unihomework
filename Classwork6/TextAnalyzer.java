package Classwork6;

import java.util.Scanner;

public class TextAnalyzer {
	public static String[] ownSplit(String text) {
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

	public static void findEmails(String text) {
	    String[] words = ownSplit(text);
	    int emailCount = 0;
	    System.out.println("email-адреса:");
	    for (String word : words) {
	        if (word.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[.,]?")) { 
	            emailCount++;
	            System.out.println(emailCount + ". " + word); 
	        }
	    }
	    if (emailCount == 0) {
	        System.out.println("email-адреса не найдены");
	    }
	}

    
	public static void findDates(String text) {
	    String[] words = ownSplit(text);
	    int dateCount = 0;
	    System.out.println("даты:");
	    for (String word : words) {
	        if (word.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(19|20)[0-9]{2}[.,]?")) {
	            dateCount++;
	            System.out.println(dateCount + ". " + word);
	        }
	    }
	    if (dateCount == 0) {
	        System.out.println("даты не найдены");
	    }
	}

	public static void findCapitalizedWords(String text) {
	    String[] words = ownSplit(text);
	    int wordCount = 0;
	    System.out.println("слова с заглавной буквы:");
	    for (int i = 0; i < words.length; i++) {
	        String word = words[i];
	        if (word.length() > 0) {
	            char firstChar = word.charAt(0);
	            if ((firstChar >= 'А' && firstChar <= 'Я') || firstChar == 'Ё' || (firstChar >= 'A' && firstChar <= 'Z')) {
	                if (i > 0 && !words[i-1].matches(".*[.!?]")) {
	                    wordCount++;
	                    System.out.println(wordCount + ". " + word);
	                }
	            }
	        }
	    }
	    if (wordCount == 0) {
	        System.out.println("слова с заглавной буквы не найдены");
	    }
	}

	public static void countDigits(String text) {
	    System.out.println("статистика числовых данных: ");
	    int count = 0;
	    for (int i = 0; i < text.length(); i++) {
	        char c = text.charAt(i);
	        String symbol = String.valueOf(c);
	        if (symbol.matches("[0-9]")) {
	            count++;
	        }
	    }
	    System.out.println("всего цифр: " + count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите текст для анализа: ");
		String text = scanner.nextLine();
		findEmails(text);
		findDates(text);
		findCapitalizedWords(text);
		countDigits(text);
	}
}