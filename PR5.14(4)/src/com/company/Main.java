package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2;
        System.out.println("Введіть два ім'я: ");
        if (sc.hasNext()) {
            name1 = sc.next();
            name2 = sc.next();
            name1.equalsIgnoreCase(name2);
            System.out.println(name1+" = "+name2);
        }else{
            System.out.println("Ці слова різні");
        }
    }
}


//"Hello".equalsIgnoreCase("hello");