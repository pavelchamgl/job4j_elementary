package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}