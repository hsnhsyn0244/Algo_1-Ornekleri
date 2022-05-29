package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dizi[][] = new String[2][3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.println("dizi elemanlarını giriniz : ");
                dizi[i][j] = scan.nextLine();
            }
        }
        int k = 0;
        String yeniDizi[] = new String[6];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                yeniDizi[k] = dizi[i][j];
                k++;
            }
        }
        for (int i=0;i< yeniDizi.length;i++){
            System.out.println(yeniDizi[i]);
        }


    }
}
