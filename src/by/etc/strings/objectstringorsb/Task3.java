package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
Проверить, является ли данное слово палиндромом.
 */

public class Task3 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String revStr = reverseText(text);

        if(text.matches(revStr)) {
            System.out.println("is palindrome");
            return true;
        } else {
            System.out.println("is not palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(readString()));
    }
}
