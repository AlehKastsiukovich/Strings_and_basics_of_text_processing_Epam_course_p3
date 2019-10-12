package by.etc.strings.patternandmatch;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка содержащая xml-док. Написать анализатор позволяющий последовательно возвращать
 * содержимое узлов xml-документа и его тип(открывающий тег, закрывающий тег, содержимое тега
 * тег без тела).
 */

public class Task2 {
    private static String xmlText =
            "<notes>" +
                    "<note id = 1>" +
                    "<to>Вася<\\to>" +
                    "<from>Света<\\from>" +
                    "<heading>Напоминание<\\heading>" +
                    "<body>Позвони мне завтра<\\body>" +
                    "<\\note>" +
                    "<note id = 2>" +
                    "<to>Петя<\\to>" +
                    "<from>Маша<\\from>" +
                    "<heading>Важное напоминание<\\heading>" +
                    "<\\body>" +
                    "<\\note>" +
                    "<\\notes>";

    public static void analizator(String text) {
        Pattern tagPattern = Pattern.compile("(<.[^(><.)]+>)|([А-Яа-я\\s]+)");
        Pattern context = Pattern.compile("[А-Яа-я]*");

        Matcher matcher = tagPattern.matcher(xmlText);

        while (matcher.find()) {
            String test = matcher.group();

            if (test.matches("(<\\\\.*>)")) {
                System.out.println(matcher.group() + " - closed tag");
            } else if (test.matches("<[^\\\\].*>")) {
                System.out.println(matcher.group() + " - open tag");
            } else {
                System.out.println(matcher.group() + " - tag context");
            }
        }
    }

    public static void main(String[] args) {
        analizator(xmlText);
    }
}

