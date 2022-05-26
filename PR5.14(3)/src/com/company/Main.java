package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введіть 3 дробові числа:");
        Scanner in = new Scanner(System.in);
        String m = in.next();
        String s = in.next();
        String n = in.next();

        int index1 = m.indexOf(",");
        int index2 = s.indexOf(",");
        int index3 = n.indexOf(",");

        if (index1 >= 0 | index2 >= 0 | index3 >= 0) {
            m = m.replace(',', '.');
            s = s.replace(',', '.');
            n = n.replace(',', '.');
        }

        double m1 = Double.valueOf(m);
        double s1 = Double.valueOf(s);
        double n1 = Double.valueOf(n);

        if (m1!= index1 | s1!= index2 | n1!= index3){
            System.out.println("Ви ввели не дробове число!");
        }else if (m1>n1 & m1>s1) {
            System.out.println("m = "+m+" s = "+s+" n = "+n);
            System.out.println(m1 + " - найбільше число");
        }else if (n1>m1 & n1>s1) {
            System.out.println("m = "+m+" s = "+s+" n = "+n);
            System.out.println(n1 + " - найбільше число");
        }else if(s1>m1 & s1>n1){
            System.out.println("m = "+m+" s = "+s+" n = "+n);
           System.out.println(s1 + " - найбільше число");
        }
    }
}



