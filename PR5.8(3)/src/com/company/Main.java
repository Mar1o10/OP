package com.company;

public class Main {

    public static void main(String[] args) {
        String choice = "Yes";
        switch (choice) {
            case "Yes":
            case "Y":
            case "OK":
            case "Ok":
            case "Так":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "No":
            case "N":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;

        }
    }
}
