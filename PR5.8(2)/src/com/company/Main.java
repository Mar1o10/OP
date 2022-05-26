package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 965;
    int k = n%10;
    int m = (n/10)%10;
    int s = (n/100)%10;
    if (k>m & k>s) {
        System.out.println(k);
    }else if (m>k & m>s) {
        System.out.println(m);
    }else{
        System.out.println(s);
    }

    }
}
