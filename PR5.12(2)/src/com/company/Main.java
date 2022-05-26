package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
        }
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 != 0)
                array[i] = 0;
            System.out.print(array[i] + " ");
        }
    }
}
