package com.company;

import java.util.Scanner;

public class ornek_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam =0;
        for (int i =0 ; i<10; i++){
            System.out.println("Sayiyi giriniz :");
            int sayi =scan.nextInt();
            toplam+=sayi;

        }
        System.out.println(toplam);
    }
}
