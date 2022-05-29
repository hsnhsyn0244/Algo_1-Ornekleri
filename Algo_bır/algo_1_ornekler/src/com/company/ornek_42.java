package com.company;

import java.util.Scanner;

public class ornek_42 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("r giriniz :");
        int r=scan.nextInt();
        System.out.println("h giriniz :");
        int h= scan.nextInt();
        double hacim =Math.PI*r*r*h;
        double alan=(2*Math.PI*r*r)+(2*Math.PI*r*h);
        System.out.println("alan : "+alan);
        System.out.println("hacim : "+hacim);
    }
}
