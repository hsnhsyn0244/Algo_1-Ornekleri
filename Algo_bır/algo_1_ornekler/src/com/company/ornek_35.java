package com.company;

import java.util.Scanner;

public class ornek_35 {
    public static void main(String[] args) {
        int yüzler,onlar,birler;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        int sayi = scan.nextInt();

        yüzler= sayi/100;
        sayi=sayi-(yüzler*100);

        onlar=sayi/10;
        sayi=sayi-(onlar*10);

        birler=sayi;
        System.out.println("yüzler basamağı : "+yüzler);
        System.out.println("onlar  basamağı : "+onlar);
        System.out.println("birler basamağı : "+birler);

    }
}
