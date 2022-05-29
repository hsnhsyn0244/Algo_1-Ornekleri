package com.company;

import java.util.Scanner;

public class ornek_18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");

        int sayi = scan.nextInt();

        if(sayi%2==0){
            System.out.println("Sayi cift dir : "+sayi);
        }else{
            System.out.println("sayi tektir : "+ sayi);
        }

    }
}
