package by.etc.strings.objectstringorsb;

import java.util.Scanner;

/**
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран
Случай, когда слов несколько не обрабатывать.
 */

public class Task8 {

    public static String findLongestWord(String text) {
        String [] stringsArray = text.split(" ");

        String maxLenght = stringsArray[0];
        for(int i = 0; i < stringsArray.length; i++) {

            if(stringsArray[i].length() > maxLenght.length()) {
                maxLenght = stringsArray[i];
            }
        }

        return maxLenght;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        String maxL = findLongestWord(text);
        System.out.println("the biggest word is : " + maxL);
    }
}
