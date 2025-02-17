package by.belyaev.L09_01_2025;

/*Задача 2: Пропуск четных чисел
        Напишите программу, которая выводит все нечетные числа от 1 до 20, используя цикл for. Пропустите четные числа с помощью оператора continue.*/
public class Task04 {
    public static void main(String[] args) {
        int b;
        for (int a = 1; a < 20; a++) {
         b = a % 2;
         if (b != 0) {
             System.out.println(a);
         }
        }
    }
}
