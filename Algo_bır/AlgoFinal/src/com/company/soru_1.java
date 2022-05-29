package com.company;

import java.util.Scanner;

public class soru_1 {
    public static void main(String[] args) {
        // stringde rakam
        String rakam[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String dizi[][] = new String[2][2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.println(" Dizi elemanlarını giriniz : ");
                dizi[i][j] = scan.nextLine();
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                String kelime = dizi[i][j];
                int sayac = 0;
                String harf = "";
                for (int k = 0; k < kelime.length(); k++) {
                    harf = kelime.charAt(k) + "";

                    for (int l = 0; l < rakam.length; l++) {
                        if (harf.equals(rakam[l])) {
                            sayac++;
                        }
                    }
                }
                if (sayac == 0) {
                    System.out.println(kelime);
                }
            }
        }



    }
}
