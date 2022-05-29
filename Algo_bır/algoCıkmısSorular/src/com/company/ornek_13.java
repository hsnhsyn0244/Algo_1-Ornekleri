package com.company;

import java.util.Scanner;

public class ornek_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "sayiyi gir ");
        int sayi = scan.nextInt();
        int toplam=0;
        if (sayi>0){
            while (sayi!=0){
                toplam+=sayi%10;
                sayi=sayi/10;
            }
        }
        System.out.println(toplam);


    }
}
