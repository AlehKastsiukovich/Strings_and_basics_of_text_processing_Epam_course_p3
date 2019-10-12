package by.etc.strings.arraysofchars;


import java.util.Scanner;

/**
В строке найти количество чисел
 */

public class Task4 {

    public static String readString() {
        String text = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        text = scanner.next();
        return text;
    }

    public static void amountOfNumberWoRegex(String text) {
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

        System.out.println("count =  " + count);
    }

    public static void amountOfNumbers(String text) {
        String newLine = text.replaceAll("[a-zA-z]+","_");
        String [] arrayOfNums = newLine.split("\\d+");

        int count = arrayOfNums.length;
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        //amountOfNumbers(readString());
        amountOfNumberWoRegex(readString());
    }
}

