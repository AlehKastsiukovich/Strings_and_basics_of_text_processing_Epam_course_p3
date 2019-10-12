package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
 Удалить в строке все лишние пробелы, т.е серии идущих подряд пробелов. Крайние пробелы удалить.
 */

public class Task5 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void deleteSpaces(String text) {
        System.out.println("After: " + text);
        String newLine = text.replaceAll("\\s+", " ").trim();
        System.out.println("Before: " + newLine);
    }

    public static void main(String[] args) {
        deleteSpaces("   hel  lo wor    ld ");
    }
}
