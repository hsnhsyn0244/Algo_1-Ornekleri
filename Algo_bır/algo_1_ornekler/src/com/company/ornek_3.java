package com.company;

import java.util.Scanner;

public class ornek_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi=scan.nextInt();
        if (sayi==0){
            System.out.println("sayi sıfırdır : "+sayi);
        }else if (sayi<0){
            System.out.println("sayi negatiftir : "+sayi);
        }else{
            System.out.println("sayi pozitiftir : "+sayi);
        }
    }
}
