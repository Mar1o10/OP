package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5 слів:");
        String s1 = sc.nextLine().substring(0, 1);
        String s2 = sc.nextLine().substring(0, 1);
        String s3 = sc.nextLine().substring(0, 1);
        String s4 = sc.nextLine().substring(0, 1);
        String s5 = sc.nextLine().substring(0, 1);
        System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
    }
}