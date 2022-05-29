package com.company;

import java.util.Scanner;

public class ornek_3 {
    public static void main(String[] args) {
        // mükemmel sayi
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi =scan.nextInt();
        int toplam=0;


        for (int i=1;i<sayi;i++){

            if (sayi%i==0){
                toplam+=i;
            }
        }if (sayi==toplam){
            System.out.println("mükemmel sayidir .");
        }else{
            System.out.println("mükemmel sayi değildir  .");
        }

    }
}
