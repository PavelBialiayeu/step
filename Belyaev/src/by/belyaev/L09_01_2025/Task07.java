package by.belyaev.L09_01_2025;

import java.util.Scanner;

/*Задача 5: Счетчик чисел
        Напишите программу, которая считает количество введенных пользователем чисел до тех пор, пока не будет введено число 10. Используйте break для выхода из цикла.*/
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int b = 0;
        while (true) {
            System.out.println("Введите число");
            num = sc.nextInt();
            b = b + 1;
            if (num == 10) {
                System.out.println("Программа завершена. Количество введенных чисел равно: " + b);
                break;
            }
        }
    }
}
