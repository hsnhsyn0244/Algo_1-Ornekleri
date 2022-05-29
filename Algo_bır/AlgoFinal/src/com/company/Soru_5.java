package com.company;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        int dizi[] = new int[10];
        Scanner scan = new Scanner(System.in);
        int enb = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi elemanlarını giriniz : ");
            dizi[i] = scan.nextInt();

        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" - ");
            if (dizi[i]%2==1){
                if (dizi[i] > enb) {
                    enb=dizi[i];

                }
            }

        }
        System.out.println("en büyük tek sayi : "+enb);

    }
}
