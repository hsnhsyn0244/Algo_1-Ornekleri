package com.company;

import java.util.Scanner;

public class ornek_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ürün alış fiyatını giriniz : ");
        double urunFiyatı= scan.nextDouble();
        System.out.println("ürünün vergi oranını giriniz : ");
        double vergıOranı=scan.nextDouble();
        System.out.println("ürünün KDV oranını giriniz : ");
        double kdvOranı = scan.nextDouble();

        double yeniFiyat=urunFiyatı+(urunFiyatı*vergıOranı/100)+(urunFiyatı*kdvOranı/100);

        System.out.println(yeniFiyat);

    }
}
