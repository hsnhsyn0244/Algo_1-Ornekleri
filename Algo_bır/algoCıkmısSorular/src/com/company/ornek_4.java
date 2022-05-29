package com.company;

import java.util.Scanner;

public class ornek_4 {
    public static void main(String[] args) {
        // basmak değeri karaleri toplamı kendine eşit olan 3 basamaklı sayilar

        int yüzler = 0;
        int onlar = 0;
        int birler = 0;
        int a = 0;

        for (int i = 100; i < 1000; i++) {

            yüzler=i/100;
            i=i%100;
            System.out.println(i);
            onlar=i/10;
            i=i%10;
            System.out.println(i);
            birler=i;
            System.out.println("yüzler : "+yüzler+"  onlar : "+onlar+
                    "  birler : "+birler);

            yüzler = i / 100;
            System.out.println("yüzler : " + yüzler);
            onlar = (i - yüzler * 100) / 10;
            System.out.println("onlar : " + onlar);
            birler = i % 10;
            System.out.println("birler : " + birler);
            System.out.println("--------");
            a = yüzler * yüzler + onlar * onlar + birler * birler;
            System.out.println("basmak değer kare toplamı :" + a);
            System.out.println("//////////////////////");
        }


    }
}
