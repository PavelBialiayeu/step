package by.belyaev.L19_12_2024;

public class Task03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 2;
        if (a == b) {
            System.out.println("Есть пара одинаковых чисел: " + a + " и " + b);
        }
        if (a == c) {
            System.out.println("Есть пара одинаковых чисел: " + a + " и " + c);
        }

        if (b == c) {
            System.out.println("Есть пара одинаковых чисел: " + b + " и " + c);
        }

        if (a == b && b == c) {
            System.out.println("Все числа равны друг другу: " + a + " и " + b + " и " + c);
        }
        else {
            System.out.println("Одинаковых пар чисел нет");
        }

    }
}
