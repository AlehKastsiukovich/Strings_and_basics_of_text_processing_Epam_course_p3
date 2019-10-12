package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
Заменить в строке все вхождения word на letter.
 */

public class Task2 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void replacement(String text) {
        String regex = "letter";
        text = text.replaceAll("word", regex);
        System.out.println(text);
    }

    public static void main(String[] args) {
        replacement(readString());
    }
}
