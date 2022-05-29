package com.company;

import java.util.Scanner;

public class ornek_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dizi[]=new int[5];

        for (int i=0;i<5;i++){
            dizi[i]= scan.nextInt();

        }for (int j=4;j>=0;j--){
            System.out.println(dizi[j]);
        }


    }
}
