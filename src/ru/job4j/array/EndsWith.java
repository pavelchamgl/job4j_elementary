package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int indexWord = word.length - 1;
        for (int index = post.length - 1; index >= 0; index--) {
            if (word[indexWord] != post[index]) {
                result = false;
            } else {
                indexWord--;
            }
        }
        return result;
    }
}