package by.etc.strings.objectstringorsb;

/**
С помощью функции копирования и операции конкатенации составить из частей слова
"информатика" слово "торт".
 */

public class Task4 {

    public static void concatTort(String text) {
        String t = text.substring(7,8);
        String o = text.substring(3,4);
        String r = text.substring(4,5);
        String t2 = text.substring(7,8);

        String result = t.concat(o).concat(r).concat(t2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        concatTort("Информатика");
    }
}
