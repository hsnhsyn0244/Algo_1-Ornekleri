package com.company;

public class Main {

    // 1' den 10 a kadar olan sayıların toplamı.

    public static int f(int x){
        if (x==10){
            return 10;
        }
        System.out.println("x : "+x);
        return x+f(x+1);
    }


    public static void main(String[] args) {
        System.out.println("f(0) : "+f(0));
    }
}
