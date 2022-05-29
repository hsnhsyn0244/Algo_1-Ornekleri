package com.company;

import java.util.Scanner;

public class ornek_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunuz giriniz");
        double vize = scan.nextDouble() * 30 / 100;
        System.out.println("Final notunuz giriniz");
        double fınal = scan.nextDouble() * 70 / 100;
        System.out.println("vize notunuz : " + vize);
        System.out.println("Fınal notunuz : " + fınal);
        double ortalama = vize + fınal;
        System.out.println("Notunuz : " +ortalama);
        if (fınal > 50 && ortalama > 50) {
            System.out.println(" geçtiniz");
        }  if (ortalama<60 && ortalama>50){
            System.out.println("CC notunuz : "+ortalama);
        }else if (ortalama<70 && ortalama>60){
            System.out.println("CB notunuz : "+ortalama);
        }else if (ortalama<80 && ortalama>70){
            System.out.println("BB notunuz : "+ortalama);
        }else if (ortalama<90 && ortalama>80){
            System.out.println("BA notunuz : "+ortalama);
        }else if (ortalama<=100 && ortalama>90){
            System.out.println("AA notunuz : "+ortalama);
        }else {
            System.out.println("kaldınız : " + ortalama);
        }

    }
}
