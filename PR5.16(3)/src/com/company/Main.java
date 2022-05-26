package com.company;

public class Main {

    public static void main(String[] args) {
       int a = (int) Math.round(Math.random() * 101);
       String aStr = String.valueOf(a);
       System.out.println("Число: "+a);
       System.out.println("К-сть чисел: "+aStr.length());
    }
}
