package by.belyaev.L13_01_2025;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                a++;
            }
        }
        System.out.println("Количество четных чисел в введенном массиве равно: " + a);
    }
}
