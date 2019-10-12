package by.etc.strings.objectstringorsb;


import java.util.Scanner;

/**
 * Строка Х состоит из нескольких предложений. Каждая из которых кончается точкой,
 * восклицательным или вопросительным знаком. Сколько предложений?
 */

public class Task10 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void numberOfSentences(String text) {
        String newText = text.replaceAll("[^(\\.|\\?|!)]","");
        System.out.println(newText);
        int length = newText.length();
        System.out.println("Number of sentences = " + length);
    }

    public static void main(String[] args) {
        numberOfSentences("Hello.world!world?world,or not world.");
    }
}
