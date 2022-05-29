package com.company;

import java.util.Scanner;

public class ornek_49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yüksekliğini giriniz : ");
        int h=scan.nextInt();
        System.out.println("Taban uzunluunu giriniz : ");
        int tabanUzunlugu= scan.nextInt();

        int alan=h*tabanUzunlugu;
        System.out.println("parelel kenarın alanı : "+alan);


    }
}
