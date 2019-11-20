package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
 Удалить в строке все лишние пробелы, т.е серии идущих подряд пробелов. Крайние пробелы удалить.
 */

public class Task5 {


    public static String deleteSpaces(String text) {
        String newLine = text.replaceAll("\\s+", " ").trim();

        return newLine;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        System.out.println("After: " + text);

        String newLine = deleteSpaces(text);
        System.out.println("Before: " + newLine);
    }
}
