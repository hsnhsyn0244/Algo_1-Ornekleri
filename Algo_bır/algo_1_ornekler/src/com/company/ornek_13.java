package com.company;

import java.util.Scanner;

public class ornek_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tabanı giriniz : ");
        int taban = scan.nextInt();

        System.out.println("Yuksekligi giriniz : ");
        int yukseklik = scan.nextInt();

        double alan = taban * yukseklik / 2;
        System.out.println("ucgenin alanı : " + alan);
    }
}
