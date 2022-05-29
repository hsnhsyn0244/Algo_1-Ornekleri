package com.company;

import java.util.Random;

public class ornek_50 {
    public static void main(String[] args) {
        Random random=new Random();
        int toplam=0;
        int sayac=0;
        for (int i=1; i<=10; i++){

            int sayi= random.nextInt();
            sayac++;

            toplam+=sayi;

            System.out.println(sayi);
            System.out.println("--------------");
        }
        System.out.println("ortalama : "+toplam/sayac);
    }
}
