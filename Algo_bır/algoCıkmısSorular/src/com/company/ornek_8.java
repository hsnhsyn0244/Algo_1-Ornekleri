package com.company;

import java.util.Scanner;

public class ornek_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dizi[]=new int [10];

        for (int i=0;i< dizi.length;i++) {
            System.out.println(dizi[i] + ". elemanı giriniz");
            dizi[i] = scan.nextInt();
        }
        for (int i=0; i< dizi.length;i++){
            for (int j=0;j<dizi[i];j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("--");
        }


    }
}
