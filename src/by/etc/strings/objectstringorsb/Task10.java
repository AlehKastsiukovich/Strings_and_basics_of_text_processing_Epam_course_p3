package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Строка Х состоит из нескольких предложений. Каждая из которых кончается точкой,
 * восклицательным или вопросительным знаком. Сколько предложений?
 */

public class Task10 {

    public static int numberOfSentences(String text) {
        String newText = text.replaceAll("[^(\\.|\\?|!)]","");
        int length = newText.length();

        return length;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        int len = numberOfSentences(text);

        System.out.println("Number of sentences = " + len);
    }
}
