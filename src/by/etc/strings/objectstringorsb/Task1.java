package by.etc.strings.objectstringorsb;


/**
Дан текст(строка). Найди наибольшее количество идущих пробелов подряд.
 */

public class Task1 {

    public static int maxLength(String text) {
        String[] array = text.split("\\S+");
        int maxSpaceLength = array[0].length();

        for (int i = 1; i < array.length; i++) {

            if (array[i].length() > maxSpaceLength) {
                maxSpaceLength = array[i].length();
            }
        }

        return maxSpaceLength;
    }

    public static void main(String[] args) {
        System.out.println("Max sequence = " + maxLength("hello   123  on     "));
    }
}
