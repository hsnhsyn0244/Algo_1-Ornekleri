package com.company;

import java.util.Scanner;

public class ornek_25 {
    public static void main(String[] args) {
        int sayac=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayiyi giriniz : ");
        int sayi = scan.nextInt();
        if (sayi>0 &&  sayi<99999){
            while (sayi/10>=1){
                sayi/=10;
                sayac++;
            }
            sayac++;
        }
        System.out.println(sayac);
    }
}
