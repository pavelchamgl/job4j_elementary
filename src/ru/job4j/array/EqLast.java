package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int index = right.length -1; index >= 0; index--) {
            if (left[index] == right[index]) {
                result = true;
            }
        }
        return result;
    }
}