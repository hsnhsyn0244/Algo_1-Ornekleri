package com.company;

import java.util.Scanner;

public class ornek_45 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi yi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Sayi yi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Sayi yi giriniz");
        int sayi3=scan.nextInt();

        double toplam=sayi1+sayi2+sayi3;
        double ortalama = toplam/3;
        System.out.println(ortalama);

    }
}
