/*Создайте функцию, которая находит максимальное значение третьего ребра
треугольника, где длины сторон являются целыми числами.*/
public class task8 {
    public static void main(String[] args) {
        System.out.println(nextEdge(8,10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));
    }

    static int nextEdge(int a, int b) {
        return a + b - 1;
    }
}
