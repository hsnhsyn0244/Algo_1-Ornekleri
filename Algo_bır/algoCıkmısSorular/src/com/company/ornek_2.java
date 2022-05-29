package com.company;

import java.util.Scanner;

public class ornek_2 {
    public static void main(String[] args) {
        // sayinin ikinin kac katı oldugu
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi= scan.nextInt();
        int sayac =0;
        while (sayi>1){

            if (sayi%2==0){
                sayi=sayi/2;
                sayac++;

            }else{
                System.out.println("bölünmez .");
            break;
            }

        }
        System.out.println(sayac);
    }
}
