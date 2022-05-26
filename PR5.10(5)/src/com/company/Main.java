package com.company;

public class Main {

    public static void main(String[] args) {
        int hour,minute,hour1,minute1;
        int k = 1;
        for (int h = 1; h<24; h++){
            hour = h/10;
            hour1 = h%10;
            for (int m = 1; m<60; m++){
                minute = m/10;
                minute1 = m%10;
                if (hour == minute1 & minute == hour1){
                    System.out.println(hour+""+hour1+":"+minute+""+minute1);
                    k++;
                }
            }
        }
        System.out.println("К:"+k);
    }
}
