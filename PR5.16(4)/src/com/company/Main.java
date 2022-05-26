package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int prog1, prog2, prog3, user1, user2, user3, i;

        do {
            prog1 = (int) (Math.random() * 3+1);
            prog2 = (int) (Math.random() * 3+1);
            prog3 = (int) (Math.random() * 3+1);
            while (prog1 == prog2 | prog1 == prog3 | prog2 == prog3){
                prog1 = (int) (Math.random() * 3+1);
                prog2 = (int) (Math.random() * 3+1);
                prog3 = (int) (Math.random() * 3+1);
            }
        } while (prog1 == 0 & prog2 == 0 & prog3 == 0);

        System.out.println("Програма загадала послідовність");
        i = 0;
        user1 = 0;
        user2 = 0;
        user3 = 0;
        do {
            i++;
            System.out.print("Введіть число від 1 до 3 включно: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                user1 = input.nextInt();
                user2 = input.nextInt();
                user3 = input.nextInt();
                if (user1 == prog1 & user2 == prog2 & user3 == prog3) {
                    System.out.println("Ви вгадали! К-сть спроб: " + i);
                    break;
                }else if (i==2){
                    System.out.println("Ви не вгадали. Кінець "+prog1+" "+prog2+" "+prog3);
                }else{
                    System.out.println("Ви не вгадали. Спробуйте ще раз");
                }
            }else {
                System.out.println("Ви ввели не ціле число або ввели літеру");
            }
        }while (i<=1);
    }
}
