package com.company;

import java.util.Scanner;

public class ornek_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[] = new int[10];
        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = scan.nextInt();
        }
        for (int i = 0,j=dizi.length-1; i < dizi.length; i++,j--) {
            if (dizi[i]==dizi[j]){
                sayac++;
            }
        }if (sayac==dizi.length){
            System.out.println("polindromdur : ");
        }else{
            System.out.println("polindrom değil : ");
        }

    }
}
