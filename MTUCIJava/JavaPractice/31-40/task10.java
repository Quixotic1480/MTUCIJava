/*Предположим, что пара одинаковых символов служит концами книги для всех
символов между ними. Напишите функцию, которая возвращает общее количество
уникальных символов (книг, так сказать) между всеми парами концов книги.*/
import java.util.HashMap;
import java.util.Map;

public class task10 {
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }

    public static int countUniqueBooks(String book, Character end) {
        Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
        boolean parse = false;
        for (char c: book.toCharArray()) {
            if (parse && c != end) chars.put(c, true);
            if (c == end) {
                if (parse) parse = false;
                else parse = true;
            }
        }
        return chars.size();
    }
}
