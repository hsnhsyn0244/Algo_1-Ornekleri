package com.company;

import java.util.Scanner;

public class ornek_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double sayi1=scan.nextInt();
        double sayi2=scan.nextInt();
        double sayi3=scan.nextInt();
        double sayi4=scan.nextInt();
        double sayi5=scan.nextInt();

        double toplama = sayi1+sayi2+sayi3+sayi4+sayi5;
        double ortlama = toplama/5 ;
        System.out.println("toplam : "+toplama+" ortalama : "+ortlama);

    }
}
