package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Вводится строка. Требуется удалить из нее все повторяющиеся символы и пробелы.
*/

public class Task7 {

    public static String removeRepeats(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (!result.contains(String.valueOf(text.charAt(i)))) {
                result += String.valueOf(text.charAt(i));
            }
        }
        result = result.replaceAll("\\s", "");

        return result;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        String newText = removeRepeats(text);
        System.out.println(newText);
    }
}
