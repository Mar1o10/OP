package com.company;

public class Main {

    public static void main(String[] args) {
	    int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
       double a1 = 0, a2 = 0, a3 = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            a1 += array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            a2 += array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            a3 += array3[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        a1 = a1 / 5;
        a2 = a2 / 5;
        a3 = a3 / 5;
        System.out.println(a1 = a1 / 5);
        System.out.println(a2 = a2 / 5);
        System.out.println(a3 = a3 / 5);
        if (a1 > a2 & a1 > a3)
            System.out.println("a1-max");
        else if (a2 > a1 & a2 > a3)
            System.out.println("a2-max");
        else if (a3 > a1 & a3 >a2)
            System.out.println("a3-max");
        else if (a1 == a2)
            System.out.println("a1=a2");
        else if (a2 == a3)
            System.out.println("a2=a3");
        else if (a1 == a3)
            System.out.println("a1=a3");
        else
            System.out.println("a1=a2=a3");



    }
}
