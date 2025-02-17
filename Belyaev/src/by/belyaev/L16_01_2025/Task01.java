package by.belyaev.L16_01_2025;

import by.belyaev.utils.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //deleteNumFromArray();
        //isPalindrome();
        sravnenie();
    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60);
        int deleteIndex = 2; //удалим элемент с индексом 2
        if (deleteIndex < intArray.length && deleteIndex >= 0) {
            int[] ints = new int[intArray.length - 1];
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (deleteIndex == i) {
                    continue;
                }
                ints[j] = intArray[i];
                j++;
            }
            System.out.println((Arrays.toString(ints)));

        } else {
            System.out.println("Индекс вне диапазона");
        }

    }

    private static void isPalindrome() {
        boolean isPalindrom = true;
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom ? "Симметиричный" : "Не симметричный");
    }

    private static void sravnenie() {
        boolean sravnenie = true;
        int[] array = {1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                sravnenie = false;
                break;
            }
        }
        System.out.println(sravnenie ? "Равны" : "Не равны");
    }
}