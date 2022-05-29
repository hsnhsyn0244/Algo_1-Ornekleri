package com.company;

import java.util.Scanner;

public class basamakSayiBulma {

    public static int bas(int n) {
        if (n <= 9 && n >= 0) {
            return 1;
        }
        System.out.println(n);
        return 1 + bas(n / 10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");

        int sayi = scan.nextInt();
        System.out.println(bas(sayi));
    }
}
