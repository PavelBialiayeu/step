package by.belyaev.L13_01_2025;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }
        System.out.println("Максимальное число из введенных: " + max);
    }
}
