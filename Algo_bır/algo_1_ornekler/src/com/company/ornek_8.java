package com.company;

import java.util.Scanner;

public class ornek_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int sayi = scan.nextInt();
        int faktoriyel=1;
        for (int i=sayi; i>0; i--){
            faktoriyel =faktoriyel*i;
            System.out.println(faktoriyel);
        }
        System.out.println("----------");
        System.out.println(faktoriyel);
    }
}
