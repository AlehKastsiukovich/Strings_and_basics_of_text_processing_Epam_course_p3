package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
В строке найти количество цифр.
 */

public class Task3 {

    public static int findAmountWithoutRegex(String text) {
        char[] ch = text.toCharArray();
        int count = 0;

        for (char character : ch) {
            if (Character.isDigit(character)) {
                count++;
            }
        }

        return count;
    }

    public static int findAmountOfDigitsRegex(String text) {
        String newLine = text.replaceAll("[a-zA-z_ ]", "");
        char[] charsArray = newLine.toCharArray();

        int count = charsArray.length;

        return count;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        System.out.println("Number of digits is " + findAmountWithoutRegex(text));
        System.out.println("Number of digits is " + findAmountOfDigitsRegex(text));
    }
}
