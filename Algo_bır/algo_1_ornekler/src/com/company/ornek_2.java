package com.company;

import java.util.Scanner;

public class ornek_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        int vize=scan.nextInt();
        System.out.println("final notunuzu giriniz");
        int fınal=scan.nextInt();
        double ortalama = (vize*0.4)+(fınal*0.6);

        if (ortalama>=50){
            if (fınal>=50){
                System.out.println("dersi gectınız : "+ortalama);
            }else{
                System.out.println("dersten kaldınız");
            }

        }else{
            System.out.println("dersden kaldınız : "+ortalama);
        }

    }
}
