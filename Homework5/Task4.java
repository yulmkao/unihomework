package Homework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("введите n: ");
        int n = sc.nextInt();
        String vowels = "аеёиоуыэюя";
        int total = 1;
        for (int i = 0; i < n; i++){
            total *= 10;
        }
        for (int i = 0; i < total; i++){
            String word = "";
            int num = i;
            for (int j = 0; j < n; j++){
                int index = num % 10;
                word = vowels.charAt(index) + word;
                num /= 10;
            }
            System.out.println(word);
        }
    }
}