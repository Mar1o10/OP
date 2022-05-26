package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3, s4, s5;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        String one = s1.concat(" "+s2+" ");
        String two = one.concat(s3+" ");
        String three = two.concat(s4+" ");
        String four = three.concat(s5+" ");
        System.out.print(four);
    }
}
