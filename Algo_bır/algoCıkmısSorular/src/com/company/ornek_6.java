package com.company;

import java.util.Scanner;

public class ornek_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[][]=new int[3][4];
        System.out.println("dizi elemanları giriniz : ");
        int enbSayisi=0;

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                dizi[i][j]=scan.nextInt();
            }
        }
        int enb=dizi[0][0];

        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if (enb<dizi[i][j]){
                    enb=dizi[i][j];

                    enbSayisi++;
                }
            }
        }
        System.out.println("En buyuk değer"+enb);
        System.out.println("kac adaet enb oldugu "+enbSayisi);

    }
}
