package com.company;

import java.util.Scanner;

public class ornek_14 {
    public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
        System.out.println("sayiyi giriniz : ");

        int sayi= scan.nextInt();
        int sayiİdare=sayi;
        int yeniSayi=0;int basamak = 1;

        while(sayiİdare!=0){
            sayiİdare=sayiİdare/10;
            basamak*=10;
        }
        basamak/=10;

        while (sayi!=0){
            yeniSayi+=(sayi%10)*basamak;
            basamak/=10;
            sayi=sayi/10;
        }
        System.out.println(yeniSayi);

    }
}
