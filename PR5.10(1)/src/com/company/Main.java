package com.company;

public class Main {

    public static void main(String[] args) {
           for (int m = 500; m <= 650; m += 10){
               System.out.print(m+" ");
           }
           System.out.println();
           int s = 500;
           while(s <= 650){
               System.out.print(s+" ");
               s += 10;
           }
           System.out.println();
           int n = 500;
           do {
               System.out.print(n+" ");
               n += 10;
           }while (n <= 650);

    }
}

