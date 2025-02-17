package by.belyaev.L13_01_2025;

import java.util.Scanner;

//если не найдено, то вывысти -1, потом массив в обратном порядке сделать
public class Task04 {
    public static void main(String[] args) {
        int b = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для поиска его индекса");
        int a = sc.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] == a) {
                b = j;
            }
        }
        System.out.println(b);
    }
}