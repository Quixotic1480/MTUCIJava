/*Создайте функцию, которая будет для данного a, b, c выполнять следующие
действия:
– Добавьте A к себе B раз.
– Проверьте, делится ли результат на C.*/
public class task10 {
    public static void main(String[] args) {
        System.out.println(abcMath(42, 5, 10));
        System.out.println(abcMath(5, 2, 1));
        System.out.println(abcMath(1, 2, 3));
    }

    static boolean abcMath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a%c==0;
    }
}
