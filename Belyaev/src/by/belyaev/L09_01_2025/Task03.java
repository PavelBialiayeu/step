package by.belyaev.L09_01_2025;

import java.util.Scanner;

/*Прерывание цикла
        Напишите программу, которая запрашивает у пользователя ввод чисел, пока не будет введено число 0. Если число 0 введено, программа должна завершить ввод и вывести сообщение о завершении.*/
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Введите число");
            num = sc.nextInt();
            System.out.println("Вы ввели " + num);
            if (num == 0) {
                System.out.println("Программа завершена");
                break;
            }
                    }


    }

}
