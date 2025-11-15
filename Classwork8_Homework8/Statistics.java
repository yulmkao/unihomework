package Classwork8_Homework8;

import java.util.Scanner;
import java.util.regex.*;

public class Statistics {
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

    public static boolean ownEquals(String text1, String text2) {
    	if (text1.length() != text2.length()) {
    		return false;
    	}
    	for (int i = 0; i < text1.length(); i++) {
    		if (text1.charAt(i) != text2.charAt(i)) {
    			return false;
    		}
    	}
    	return true;
    }

	public static void wordsStatistic(String text) {
		String[] words = ownSplit(text);
		System.out.println("количество слов: " + words.length);
		int uniqueWordsCount = 0;
		for (int i = 0; i < words.length; i++) {
			boolean isNotUnique = false;
			for (int j = i + 1; j < words.length; j++) {
				if (ownEquals(words[i], words[j])) {
					isNotUnique = true;
					break;
				}
			}
			if (!isNotUnique) {
				uniqueWordsCount++;
			}
		}
		System.out.println("количество уникальных слов: " + uniqueWordsCount);
		String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("самое длинное слово: " + longestWord);
	}

	public static void numbersStatistics(String text) {
		int count = 0;
		double sum = 0;
		double salesSum = 0;
		Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]*");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			count++;
			sum += Double.valueOf(matcher.group());
		}
		Pattern secondPattern = Pattern.compile("\\$[0-9]+");
        Matcher secondMatcher = secondPattern.matcher(text);
        while (secondMatcher.find()) {
        	String numberOnly = "";
			for (int i = 1; i < secondMatcher.group().length(); i++) {
			    numberOnly += secondMatcher.group().charAt(i);
			}
			salesSum += Double.valueOf(numberOnly);
        }
        if (count > 1) {
        	double average = sum / count;
        	System.out.println("количество чисел: " + count);
	        System.out.println("среднее значение: " + average);
	        System.out.println("сумма продаж: " + salesSum);
        } else {
        	System.out.println("нет чисел");
        }
	}

	public static void contactsStatistics(String text) {
        String[] parts = ownSplit(text);
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[,.]")) {
                System.out.println("email: " + parts[i]);
            }
            if (parts[i].matches("(\\+7|8)[0-9]{10}[,.]")) {
                System.out.println("телефон: " + parts[i]);
            }
        }
    }

    public static void symbolsStatistics(String text) {
    	int total = text.length(); 
		Pattern lettersPattern = Pattern.compile("[A-Za-zА-Яа-я]");
		Matcher lettersMatcher = lettersPattern.matcher(text);
		int letters = 0;
		while (lettersMatcher.find()) {
		    letters++;
		}
		Pattern digitsPattern = Pattern.compile("[0-9]");
		Matcher digitsMatcher = digitsPattern.matcher(text);
		int digits = 0;
		while (digitsMatcher.find()) {
		    digits++;
		}
		Pattern spacesPattern = Pattern.compile("\\s");
		Matcher spacesMatcher = spacesPattern.matcher(text);
		int spaces = 0;
		while (spacesMatcher.find()) {
		    spaces++;
		}
		int specials = total - letters - digits - spaces;
		System.out.println("общее количество символов: " + total);
		System.out.println("буквы: " + letters);
		System.out.println("цифры: " + digits);
		System.out.println("пробелы: " + spaces);
		System.out.println("специальные символы: " + specials);
    }

    public static void sentencesStatistics(String text) {
	    String[] words = ownSplit(text);
	    int sentenceCount = 0;
	    int totalLength = 0;
	    int sentenceLength = 0;
	    for (int i = 0; i < words.length; i++) {
	        String word = words[i];
	        if (word.length() > 0) {
	        	sentenceLength += word.length() + 1;
			    char lastChar = word.charAt(word.length() - 1);
			    if (lastChar == '.' || lastChar == '!' || lastChar == '?') {
			        sentenceCount++;
			        totalLength += sentenceLength;
			        sentenceLength = 0;
			    }
			}
	    }
	    double averageLength = 0;
	    if (sentenceCount > 0) {
	        averageLength = (double) totalLength / sentenceCount;
	    }
	    System.out.println("количество предложений: " + sentenceCount);
	    System.out.println("средняя длина предложения: " + averageLength);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите текст: ");
		String text = scanner.nextLine();
        wordsStatistic(text);
        numbersStatistics(text);
        contactsStatistics(text);
        symbolsStatistics(text);
        sentencesStatistics(text);
    }
}