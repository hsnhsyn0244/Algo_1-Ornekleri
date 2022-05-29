package com.company;

import java.util.Scanner;

public class ornek_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunuz giriniz");
        double vize = scan.nextDouble() * 30 / 100;
        System.out.println("Final notunuz giriniz");
        double fınal = scan.nextDouble() * 70 / 100;
        System.out.println("vize notunuz : " + vize);
        System.out.println("Fınal notunuz : " + fınal);
        double ortalama = vize + fınal;
        if (fınal > 50 && ortalama > 50) {
            System.out.println("gectiniz : " + ortalama);
        } else {
            System.out.println("kaldınız : " + ortalama);
        }
    }
}
