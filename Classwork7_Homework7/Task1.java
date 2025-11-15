package Classwork7_Homework7;

import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
        Pattern pattern = Pattern.compile("\".*?\"");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String quote = matcher.group();
            System.out.println("найдена цитата: " + quote);
        }
    }
}