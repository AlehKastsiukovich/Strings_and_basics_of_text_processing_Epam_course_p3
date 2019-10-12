package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Посчитать количество строчных и прописных букв в строке. Учитывать только анг. буквы.
 */

public class Task9 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void count(String text) {
        String upperСase = text.replaceAll("[^(A-Z)]+","");
        int upperLength = upperСase.length();
        System.out.println("Number of uppercase letters = " + upperLength);

        String lowerCase = text.replaceAll("[^(a-z)]+","");
        int lowerLength = lowerCase.length();
        System.out.println("Number of lowercase letters = " + lowerLength);
    }

    public static void main(String[] args) {
        count(readString());
    }
}
