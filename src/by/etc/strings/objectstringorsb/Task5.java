package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Посчитать сколько раз среди символов заданной сроки встречается буква "а".
 */

public class Task5 {

    public static int countOfA(String text) {
        char[] chars = text.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'a') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        int count = countOfA(text);
        System.out.println("Number of 'a' chars in text is " + count);
    }
}
