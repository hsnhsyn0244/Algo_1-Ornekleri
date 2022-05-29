package com.company;

import java.util.Scanner;

public class ornek_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double derece= scan.nextDouble();

        if (derece>100){
            System.out.println("Gaz halindedir");
        }else if (derece<100 && derece>0){
            System.out.println("Sıvı haldedir");
        }else{
            System.out.println("Gaz halindedir");
        }
    }
}
