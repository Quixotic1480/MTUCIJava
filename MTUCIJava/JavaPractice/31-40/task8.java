/*Создайте функцию, которая возвращает true, если две строки рифмуются, и false в
противном случае. Для целей этого упражнения две строки рифмуются, если
последнее слово из каждого предложения содержит одни и те же гласные.*/
public class task8 {
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.replaceAll("\\p{Punct}","");
        str2 = str2.replaceAll("\\p{Punct}","");
        char lastletter=str1.charAt(str1.length()-1);
        char lastletter1=str2.charAt(str2.length()-1);

        if (Character.toLowerCase(lastletter1)==Character.toLowerCase(lastletter))
            return true;
        else
            return false;
    }
}
