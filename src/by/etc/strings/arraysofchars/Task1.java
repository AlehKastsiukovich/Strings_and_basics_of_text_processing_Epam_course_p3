package by.etc.strings.arraysofchars;


import java.util.Arrays;
import java.util.Scanner;

/**
 Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

public class Task1 {
    private static String[] array;

    public static void initArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        while (true) {

            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            int n = scanner.nextInt();

            if (n > 0) {
                array = new String[n];
                break;
            }
        }

        System.out.println("Enter camelCase array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        System.out.println(Arrays.toString(array));
    }

    public static void convertToSnakeCase() {
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replaceAll(regex, replacement).toLowerCase();
        }

        System.out.println(Arrays.toString(array));
    }

    public static void convertToSnakeCaseWoRegex() {
        for (int i = 0; i < array.length; i++) {
            array[i] = replaceElements(array[i]);
        }

        System.out.println(Arrays.toString(array));
    }

    public static String replaceElements(String s) {
        String p = s;
        for (int j = 0; j < s.length(); j++) {
            if (Character.isUpperCase(s.charAt(j))) {
                p = p.replace(String.valueOf(s.charAt(j)), "_" + s.charAt(j));
            }
        }

        return p.toLowerCase();
    }

    public static void main(String[] args) {
        initArray();
        convertToSnakeCaseWoRegex();
    }
}
