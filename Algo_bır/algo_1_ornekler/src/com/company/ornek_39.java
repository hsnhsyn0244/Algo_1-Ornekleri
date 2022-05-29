package com.company;

import java.util.Scanner;

public class ornek_39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kenar uzuluğunu giriniz : ");
        int a=scan.nextInt();
        System.out.println("Kenar uzuluğunu giriniz : ");
        int b=scan.nextInt();
        System.out.println("Kenar uzuluğunu giriniz : ");
        int c=scan.nextInt();


        if (a+b>c && c>b-c){
            System.out.println("üçgen çilir");
        }else{
            System.out.println("çizilemez");
        }
    }
}
