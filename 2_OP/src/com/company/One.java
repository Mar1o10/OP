package com.company;

public class One {
      static int fact(int m,int h){
          for (int r = 1; r<=h; r++){
              m = m*r;
          }
          return m;
    }
    public static void main(String[] args) {
        System.out.println(One.fact(1,5));
    }
}
