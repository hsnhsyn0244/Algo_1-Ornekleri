package com.company;

import java.util.Scanner;

public class ornek_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yarı çapı giriniz : ");
        int r = scan.nextInt();
        double alan = 4 * Math.PI * r * r;
        double hacim= 4/3*Math.PI*r*r*r;

    }
}
