package regex;

import java.util.Scanner;

public class SplitText {

    public static void main(String[] args) {
        System.out.println("Введите текст:");
        String text = new Scanner(System.in).nextLine();
        System.out.println(splitTextIntoWords(text));

    }
    public static String splitTextIntoWords(String text) {
        StringBuilder newText = new StringBuilder();
        String[] words = text.split("[\\s,.;\\d-]+");
        for (String word : words) {
            newText.append(word).append("\n");
        }
        return newText.toString().trim();
    }
}