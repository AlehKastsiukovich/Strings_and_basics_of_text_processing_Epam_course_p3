package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Посчитать сколько раз среди символов заданной сроки встречается буква "а".
 */

public class Task5 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void countOfA(String text) {
        char[] chars = text.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                count++;
            }
        }
        System.out.println("Number of 'a' chars in text is " + count);
    }

    public static void main(String[] args) {
        countOfA(readString());
    }
}
