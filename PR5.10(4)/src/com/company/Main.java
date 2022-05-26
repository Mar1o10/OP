package com.company;

public class Main {

    public static void main(String[] args) {
        int m,h;
        m = 1;
        h = 10;
        for(int r=1; r<=h; r++) {
            m = m*r;
        }
        System.out.println(h+"! = "+m);

    }
}
