package by.belyaev.L09_01_2025;
/*Задача 3: Сумма положительных чисел
        Напишите программу, которая запрашивает у пользователя ввод чисел до тех пор, пока не будет введено отрицательное число. Подсчитайте сумму всех введенных положительных чисел. Используйте break для выхода из цикла.*/

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int b = 0;
        while (true) {
            System.out.println("Введите число");
            num = sc.nextInt();
            b = b + num;
            if (num < 0) {
                b = b - num;
                System.out.println("Программа завершена. Сумма введенных чисел равна: " + b);
                break;
            }
        }
    }
}