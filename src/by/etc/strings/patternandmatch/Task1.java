package by.etc.strings.patternandmatch;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать приложение, разбирающее текст и позволяющее выполнять три разлиных операции:
 *  -отсортировать абзацы по количеству предложений.
 *  -в каждом предложении отсортировать слова по длине.
 *  -отсортировать лексемы в предложении по убыванию количеств вхождений заданного символа,
 *  а в случае равенства по алфавиту.
 */

public class Task1 {
    private static String text =
            "\tThere is nothing to do there. Text goes crazy.\n" +
                    "\tHello world and much more. Do you like taco? Sure!\n" +
                    "\tText text.";
    private static char c = 'a';

    public static void sortByParagraph(String text) {
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(text);

        String[] splitAbz = pattern.split(text);

        for (int i = 0; i < splitAbz.length; i++) {
            System.out.println(i + "" + splitAbz[i]);
        }

        Pattern pattern1 = Pattern.compile("(\\.|\\?|!)");

        String temp1;
        for (int i = splitAbz.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (pattern1.split(splitAbz[j]).length >
                        pattern1.split(splitAbz[j + 1]).length) {
                    temp1 = splitAbz[j];
                    splitAbz[j] = splitAbz[j + 1];
                    splitAbz[j + 1] = temp1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitAbz.length; i++) {
            sb.append(splitAbz[i] + "\n");
        }

        System.out.println("\t" + sb.toString().trim());
    }

    public static void sortByWordsLength(String text) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        Matcher matcher = pattern.matcher(text);

        String[] sentencesArr = text.split("(\\.|\\?|!)");
        String temp;
        StringBuilder sb1 = new StringBuilder();
        String[] arr;
        for (int i = 0; i < sentencesArr.length; i++) {
            arr = sentencesArr[i].split(" ");

            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < arr.length - 1; j++) {

                    if (arr[j].length() > arr[j + 1].length()) {
                        isSorted = false;
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print((arr[k].trim() + " "));
            }
            System.out.println();
        }
    }

    public static int countOccurrences(String sentence, char inChar) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (c == inChar) {
                count++;
            }
        }
        return count;
    }

    public static void sortByOccurrences(String text, char ch) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        String[] sentencesArr = pattern.split(text);

        for (int i = 0; i < sentencesArr.length; i++) {
            Pattern patternWord = Pattern.compile("\\s");
            String[] wordArr = patternWord.split(sentencesArr[i].trim());
            Arrays.sort(wordArr);

            boolean isSorted = false;
            String temp = null;
            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < wordArr.length - 1; j++) {

                    if (countOccurrences(wordArr[j], ch) < countOccurrences(wordArr[j + 1], ch)) {
                        isSorted = false;
                        temp = wordArr[j];
                        wordArr[j] = wordArr[j + 1];
                        wordArr[j + 1] = temp;
                    }
                }
            }

            for (int j = 0; j < wordArr.length; j++) {
                System.out.println(wordArr[j].trim());
            }
        }
    }

    public static void main(String[] args) {
        sortByParagraph(text);
    }
}


