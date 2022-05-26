package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[15][];
        array [0] = new int [5];//1
        array [1] = new int [5];//2
        array [2] = new int [5];//3
        array [3] = new int [5];//4
        array [4] = new int [8];//5
        array [5] = new int [8];//6
        array [6] = new int [8];//7
        array [7] = new int [8];//8
        array [8] = new int [3];//9
        array [9] = new int [3];//10
        array [10] = new int [3];//11
        array [11] = new int [3];//12
        array [12] = new int [9];//13
        array [13] = new int [9];//14
        array [14] = new int [9];//15
        for (int i = 0; i < array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*15);
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
