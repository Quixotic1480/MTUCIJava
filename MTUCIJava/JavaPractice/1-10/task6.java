//Создайте функцию, которая возвращает значение ASCII переданного символа.
public class task6 {
    public static void main(String[] args) {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }

    static int ctoa(char a) {
        return (int) a;
    }
}
