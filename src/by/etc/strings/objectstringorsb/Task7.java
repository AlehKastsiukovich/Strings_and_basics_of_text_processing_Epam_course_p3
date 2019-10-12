package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Вводится строка. Требуется удалить из нее все повторяющиеся символы и пробелы.
*/

public class Task7 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void removeRepeats(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if(!result.contains(String.valueOf(text.charAt(i)))) {
                result += String.valueOf(text.charAt(i));
            }
        }
        result = result.replaceAll("\\s", "");
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeRepeats("how are you");
    }
}
