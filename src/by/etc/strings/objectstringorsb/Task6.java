package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Из данной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void toDoubleChars(String text) {
        String newLine = text.replaceAll(".","$0$0");
        System.out.println("New string: " + newLine);
    }

    public static void main(String[] args) {
        toDoubleChars(readString());
    }
}
