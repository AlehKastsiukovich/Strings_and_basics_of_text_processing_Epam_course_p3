package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
В строке после каждого символа а вставить b.
 */

public class Task2 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void insertB(String text) {
        System.out.println("After: " + text);
        text = text.replaceAll("a", "ab");
        System.out.println("Before: "+ text);
    }

    public static void main(String[] args) {
        insertB(readString());
    }
}
