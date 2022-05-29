package com.company;

import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        for (int i = sayi1; i < sayi2; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                //System.out.println("i = " + i + " j = "+j);
                if (i % j == 0) {
                    sayac++;
                }

            }
            if (sayac == 0) {
                System.out.println("-" + i + "asal ");
            } else {
                System.out.println("-" + i + "asal değil ");
            }

        }
    }
}









