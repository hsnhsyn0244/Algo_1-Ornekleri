package com.company;

import java.util.Scanner;

public class ornek_12 {
    public static void main(String[] args) {
        // ornek 19 da daha doğru kod vardır.
        Scanner scan = new Scanner(System.in);

        System.out.println("Vize notunuz giriniz");
        double vize  = scan.nextDouble()*30/100;
        System.out.println("Final notunuz giriniz");
        double fınal = scan.nextDouble()*70/100;
        System.out.println("vize notunuz : "+ vize);
        System.out.println("Fınal notunuz : "+fınal);
        double ortalama = vize+fınal;

        if (ortalama>=50 ){
           if (fınal>=50){
               System.out.println("Geçtiniz notunuz : "+ ortalama);
           }else{
               System.out.println("Kaldınız notunuz : "+ ortalama);
           }
        }else{
            System.out.println("Kaldınız notunuz : "+ortalama);
        }
    }
}
