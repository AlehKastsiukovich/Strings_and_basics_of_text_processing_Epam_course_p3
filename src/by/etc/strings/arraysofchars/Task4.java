package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
В строке найти количество чисел
 */

public class Task4 {


    public static int findAmountOfNumbersWoRegex(String text) {
        char[] ch = text.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            System.out.println(i);
            if (Character.isDigit(ch[i])) {
                count++;
                while (Character.isDigit(ch[i])) {
                    i++;
                    if (i == ch.length) {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static int findAmountOfNumbers(String text) {
        String newLine = text.replaceAll("[a-zA-z]+", "_");
        String[] arrayOfNums = newLine.split("\\d+");

        int count = arrayOfNums.length;
        return count;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter string: ");
        text = scanner.nextLine();

        System.out.println("count = " + findAmountOfNumbers(text));
    }
}

