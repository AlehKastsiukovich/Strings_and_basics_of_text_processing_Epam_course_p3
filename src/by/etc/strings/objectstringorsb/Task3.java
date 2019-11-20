package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
Проверить, является ли данное слово палиндромом.
 */

public class Task3 {

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String revStr = reverseText(text);

        if (text.matches(revStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        boolean var = isPalindrome(text);
        System.out.println(var);
    }
}
