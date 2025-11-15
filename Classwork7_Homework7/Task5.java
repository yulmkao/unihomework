package Classwork7_Homework7;

import java.util.regex.*;

public class Task5 {
    public static void main(String[] args) {
        String post = "Сегодня был в #парке и #кино #отдых #выходные";
        Pattern pattern = Pattern.compile("#[^ ]+");
        Matcher matcher = pattern.matcher(post);
        while (matcher.find()) {
            String hashtags = matcher.group();
            System.out.println("хештег: " + hashtags);
        }
    }
}