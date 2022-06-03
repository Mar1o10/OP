package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 4, c, s, p;
        s = a*b/2;
        c = (int) Math.sqrt((Math.pow(a, 2))+(Math.pow(b, 2)));
        p = a + b + c;
        System.out.println("a = "+a+" b = "+b+" c= "+c);
        System.out.println("Площа = "+s+"; Периметр = "+p);
    }
}
