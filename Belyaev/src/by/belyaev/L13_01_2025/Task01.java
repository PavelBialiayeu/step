package by.belyaev.L13_01_2025;

import java.util.Scanner;

/*Заполните массив размером 10. Любыми числами (int). Найдите сумму всех его элементов и выведите результат на экран.*/
public class Task01 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[j];
        }
        System.out.println("Сумма равна: " + sum);
    }
}
