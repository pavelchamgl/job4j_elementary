package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivav Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Semen Sidorov";
        names[3] = "Mihail Mihailov";
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
    }
}