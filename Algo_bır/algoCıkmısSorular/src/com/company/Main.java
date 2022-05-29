package com.company;

public class Main {

    public static void main(String[] args) {

        double x=80;
        double v=80;
        double t=x/v;

        while (x>1.0){

            v=v*0.5;
            x=v*t;
            System.out.println("x : "+x+"  v : "+v);

        }

    }
}
