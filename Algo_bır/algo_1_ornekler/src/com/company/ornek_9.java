package com.company;

import java.util.Scanner;

public class ornek_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fahr= scan.nextDouble();
        double celcius;
        celcius =(fahr-32)/1.8;

        System.out.println(celcius);


    }
}
