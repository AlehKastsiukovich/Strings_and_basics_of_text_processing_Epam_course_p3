package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Посчитать количество строчных и прописных букв в строке. Учитывать только анг. буквы.
 */

public class Task9 {

    public static void count(String text) {
        String upperСase = text.replaceAll("[^(A-Z)]+", "");
        int upperLength = upperСase.length();
        System.out.println("Number of uppercase letters = " + upperLength);

        String lowerCase = text.replaceAll("[^(a-z)]+", "");
        int lowerLength = lowerCase.length();
        System.out.println("Number of lowercase letters = " + lowerLength);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        count(text);
    }
}
