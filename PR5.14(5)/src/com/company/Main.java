package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word1,word2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть два слова: ");
        if(sc.hasNext()) {
            word1 = sc.next();
            word2 = sc.next();
            if (word1.length() > word2.length()) {
                System.out.println(word1.length()+ " - к-сть символів у слові "+word1);
                System.out.println(word2.length()+ " - к-сть символів у слові "+word2);
                System.out.println("У слові "+word1+" більше символів ніж у слові "+word2);
            }else if (word2.length() > word1.length()){
                System.out.println(word1.length()+ " - к-сть символів у слові "+word1);
                System.out.println(word2.length()+ " - к-сть символів у слові "+word2);
                System.out.println("У слові "+word2+" більше символів ніж у слові "+word1);
            }else if (word2.length() == word1.length()){
                System.out.println(word1.length()+ " - к-сть символів у слові "+word1);
                System.out.println(word2.length()+ " - к-сть символів у слові "+word2);
                System.out.println("У словах "+word1+" і "+word2+" - однакова к-сть символів");
            }
        }
    }
}

