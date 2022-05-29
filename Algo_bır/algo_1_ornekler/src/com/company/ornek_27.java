package com.company;

import java.util.Scanner;

public class ornek_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("calısma saatini giriniz :");
        int calısmaSaati= scan.nextInt();
        int maas=0;
        System.out.println("Saat ücretini giriniz : ");
        int saatUcreti=scan.nextInt();
        if (calısmaSaati<40){
            maas=saatUcreti*calısmaSaati;
        }else if (calısmaSaati>=40){
            maas=saatUcreti*calısmaSaati*2;
        }
        System.out.println(maas);
    }
}
