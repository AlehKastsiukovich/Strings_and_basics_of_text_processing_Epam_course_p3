package by.etc.strings.objectstringorsb;

/**
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран
Случай, когда слов несколько не обрабатывать.
 */

public class Task8 {

    public static void findLongestWord(String text) {
        String [] stringsArray = text.split(" ");

        String maxLenght = stringsArray[0];
        for(int i = 0; i < stringsArray.length; i++) {
            if(stringsArray[i].length() > maxLenght.length()) {
                maxLenght = stringsArray[i];
            }
        }

        System.out.println("the biggest word is : " + maxLenght);
    }

    public static void main(String[] args) {
        findLongestWord("hello java world");
    }
}
