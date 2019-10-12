package by.etc.strings.objectstringorsb;


import java.util.Arrays;

/**
Дан текст(строка). Найди наибольшее количество идущих пробелов подряд.
 */

public class Task1 {

    public static void maxLength(String text) {
        String[] array = text.split("\\S+");
        System.out.println(Arrays.toString(array));

        int maxSpaceLength = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > maxSpaceLength) {
                maxSpaceLength = array[i].length();
            }
        }

        System.out.println("Max sequence = " + maxSpaceLength);
    }

    public static void main(String[] args) {
        maxLength("hello   123  on     ");
    }
}
