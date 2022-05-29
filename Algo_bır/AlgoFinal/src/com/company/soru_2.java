package com.company;

import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        // iki bouyutlu stringeki sutunları alıp tek boyutlu strınge atayan kod

        Scanner scan = new Scanner(System.in);
        String dizi[][] = new String[2][2];

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

        System.out.println("---------");
        int k = 0;
        String kelime = "";
        String yeniDizi[] = new String[6];
        for (int i = 0; i < dizi[0].length; i++) {

            kelime=dizi[i][0];
            yeniDizi[k]=kelime;
            k++;
        }
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.println(yeniDizi[i]);
        }

    }
}
