package by.belyaev.L20_01_2025;

import by.belyaev.utils.ArrayUtil;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        search();
    }

    private static void search() {
        long[] ints = ArrayUtil.generateLongArray(1000000, 375290000000L, 375300000000L);
        Arrays.sort(ints);
        long number = Arrays.binarySearch(ints, 375292994545L);
        System.out.println(number >= 0 ? "Номер найден в индексе " + number : "Номер не найден");
    }
}