package by.belyaev.L13_01_2025;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int lenght = array.length;
        System.out.println(lenght);
        int a = array[5];
        for (int i = 0; i < lenght; i++) {
            array[i] = i * 13;
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = {1, 2, 3, 4, 5, 7, 95, 3, 1424, 1};
        System.out.println(Arrays.toString(array2));
        int array3[] = new int[2]; // так не писать
        int[] array4 = new int[]{1, 2, 3, 44, 6, 7};
        array4[2] = 32;
        System.out.println(Arrays.toString(array4));
        char [] chars = new char[] {'a', 'b', 'g'};
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            chars [i]= 'p';
            System.out.println(chars[i]);
        }
        for (char aChar : chars) {
            System.out.println(aChar);

        }
    }
}
