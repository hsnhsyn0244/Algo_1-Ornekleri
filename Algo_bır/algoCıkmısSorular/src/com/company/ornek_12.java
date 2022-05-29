package com.company;

import java.util.Scanner;

public class ornek_12 {
    public static void main(String[] args) {
        int dizi[]=new int[10];
        Scanner scan = new Scanner(System.in);
        int aranacak=scan.nextInt();
        for (int i=0;i<dizi.length;i++){
            System.out.println("dizi elemanını giriniz");
            dizi[i]= scan.nextInt();

        }

        for (int j=0;j<dizi.length;j++){
            if (dizi[j]==aranacak){
                System.out.println(aranacak+" indis : "+j);
            }else{
                System.out.println("aranana yokdur");
            }
        }
    }
}
