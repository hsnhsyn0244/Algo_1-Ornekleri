package com.company;

import java.util.Scanner;

public class ornek_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ürün fiyatını giriniz : ");
        int kdvOranı=18;
        double fiyat = scan.nextDouble();
        
        double yeniFiyat= fiyat+fiyat*18/100;
        System.out.println("Ürünün yeni fiyatı : "+ yeniFiyat);
    }
    
}
