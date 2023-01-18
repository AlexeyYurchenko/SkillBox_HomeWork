package string;

import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        String text = new Scanner(System.in).nextLine();
        System.out.println(sequentialWordsNumbers(text));

    }

    public static String sequentialWordsNumbers(String text) {
        int num = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int end = text.indexOf(" ", i);
            String buffer;
            if (end == -1) {
                buffer = text.substring(i);
            } else {
                buffer = text.substring(i, end);
            }
            stringBuilder.append("(").append(num).append(")").append(" ").append(buffer).append(" ");
            i = i + buffer.length();
            num++;
        }
        return stringBuilder.toString().trim();
    }
}