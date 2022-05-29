package com.company;

import java.util.Scanner;

public class ornek_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("(ax2+bx+c)  denklem bu  şekilde");

        System.out.println("a değerini giriniz : ");
        double a=scan.nextDouble();
        System.out.println("b değerini giriniz : ");
        double b=scan.nextDouble();
        System.out.println("c değerini giriniz : ");
        double c=scan.nextDouble();

        double delta = (b*b)-(4*a*c);

        if (delta>0){
            double x1 = ((-1*b)-Math.sqrt(delta))/(2*a);
            double x2 = ((1*b)-Math.sqrt(delta))/(2*a);

            System.out.println("x1 : "+x1+"x2 : "+x2);

        }if (delta<0){
            System.out.println("deklemin reel kökü yoktur");
        }if (delta ==0){
            double x= (-1*b)/(2*a);
            System.out.println("Çakısık kok vardır  x1 = x2 : "+x);
        }



    }
}
