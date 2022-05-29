package com.company;

import java.util.Scanner;

public class ornek_10 {
    public static void main(String[] args) {
        // dizideki indisindeki kelimeleri tersine çevirme

        Scanner scan = new Scanner(System.in);
        String dizi[][] = new String[2][2];
        String sonuc[][] = new String[2][2];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = scan.nextLine();
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                String gelenKelime = dizi[i][j];
                String yeniKelime = "";
                for (int k = gelenKelime.length() - 1; k >= 0; k--) {
                    yeniKelime += gelenKelime.charAt(k);
                }
                sonuc[i][j] = yeniKelime;
                System.out.println(yeniKelime);
            }
        }
        //matrise yazdırma islemi
        for (int i = 0; i < sonuc.length; i++) {
            for (int j = 0; j < sonuc[i].length; j++) {
                System.out.print(sonuc[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
