package regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            String newInput = input.replaceAll("\\D+", "");
            if (newInput.matches("(7|8)?90(5|9)\\d{7}")) {
                newInput = newInput.replaceFirst("^(8?)(90)", "7$2");
                System.out.println(newInput);
            } else if (input.length() > 11 || input.length() < 10) {
                System.out.println("Неверный формат номера");
            } else {
                System.out.print(input);
            }
        }
    }
}