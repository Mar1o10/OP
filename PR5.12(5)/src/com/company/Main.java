package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int array[] = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            if (array[i] % 2 == 0)
                a++;
        }
        System.out.print("К-сть парних чисел: "+a);
    }
}
