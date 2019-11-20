package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
В строке после каждого символа а вставить b.
 */

public class Task2 {

    public static void insertB(String text) {
        System.out.println("After: " + text);
        text = text.replaceAll("a", "ab");
        System.out.println("Before: "+ text);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        insertB(text);
    }
}
