package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
В строке найти количество цифр.
 */

public class Task3 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void amountWithoutRegex(String text) {
        char [] ch = text.toCharArray();
        int count = 0;

        for (char character: ch) {
            if (Character.isDigit(character)) {
                count++;
            }
        }

        System.out.println("Number of digits is " + count);
    }

    public static void amountOfDigit(String text) {
        String newLine = text.replaceAll("[a-zA-z]", "");
        char [] charsArray = newLine.toCharArray();

        int count = charsArray.length;
        System.out.println("Number of digits is " + count);
    }

    public static void main(String[] args) {
        //amountOfDigit(readString());
        amountWithoutRegex(readString());
    }
}
