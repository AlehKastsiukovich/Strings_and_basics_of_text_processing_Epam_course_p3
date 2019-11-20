package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Из данной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {

    public static String toDoubleChars(String text) {
        String newLine = text.replaceAll(".", "$0$0");

        return newLine;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        String newLine = toDoubleChars(text);

        System.out.println("new line with double chars - " + newLine);
    }
}
