package Classwork7_Homework7;

import java.util.regex.*;

public class Task4 {
    public static void main(String[] args) {
        String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
        Pattern pattern = Pattern.compile("[^;]+");
        Matcher matcher = pattern.matcher(csv);
        while (matcher.find()) {
            String info = matcher.group();
            System.out.println("отдельная запись: " + info);
        }
    }
}