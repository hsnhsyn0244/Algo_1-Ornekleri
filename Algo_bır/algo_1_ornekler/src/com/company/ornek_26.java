package com.company;

import java.util.Scanner;

public class ornek_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cocuk sayisini giriniz : ");
        int cocukSayisi= scan.nextInt();
        System.out.println("Net maası giriniz");
        int netMaas= scan.nextInt();

        double yeniMaas = 0;

        if (cocukSayisi==1){
            yeniMaas=(netMaas)+netMaas*5/100;
        }else if (cocukSayisi==2){
            yeniMaas=(netMaas)+netMaas*10/100;
        }else if (cocukSayisi>3){
            yeniMaas=(netMaas)+netMaas*15/100;
        }
        System.out.println("İkramiye ike yeni maas : "+yeniMaas);
    }
}
