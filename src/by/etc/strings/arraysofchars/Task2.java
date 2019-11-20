package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
Заменить в строке все вхождения word на letter.
 */

public class Task2 {

    public static void replaceWord(String text) {
        String regex = "letter";
        text = text.replaceAll("word", regex);

        System.out.println(text);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        replaceWord(text);
    }
}
