package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int a = 1; a<100; a++){
            if (10 % a!=0){
                continue;
            }
            System.out.println(a);
        }
    }
}
