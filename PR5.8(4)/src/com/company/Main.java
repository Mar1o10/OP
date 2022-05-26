package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 9;  // початковий поверх
        int k = 2; //кінцевий поверх
        if (n>9 | n<1 ) {
            System.out.println("Ви вибрали неіснуючий поверх!");
        }else if  (k>9 | k<1 ){
            System.out.println("Ви вибрали неіснуючий поверх!");
        }else if (n>k & k==2){
            System.out.println("Ви спустились на 1 поверх");
        }else if (n<k & k==2){
            System.out.println("Ви піднялись на 3 поверх");
        }else if (n>k){
            System.out.println("Ви спустились на "+k+" поверх");
        }else{
            System.out.println("Ви піднялись на "+k+" поверх");
        }
    }
}
