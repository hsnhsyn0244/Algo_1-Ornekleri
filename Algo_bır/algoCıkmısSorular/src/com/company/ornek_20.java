package com.company;

import java.util.Scanner;

public class ornek_20 {
    public static void main(String[] args) {
        String aranacakKelime="beko";
        String yeniKelime="";
        Scanner scan=new Scanner(System.in);
        String dizi[][]=new String[2][2];
        for (int i=0;i<dizi.length;i++){
            for (int j =0; j<dizi[i].length;j++){
                System.out.println("kelimelerinizi giriniz");
                dizi[i][j]=scan.nextLine();
            }
            System.out.println(" ");
        }
        for (int i=0; i< dizi.length;i++){
            for (int j=0; j<dizi[i].length;j++){
                yeniKelime+=dizi[i][j].charAt(dizi[i][j].length()/2);
            }
        }
        if (aranacakKelime.equals(yeniKelime)){
            System.out.println("eşit");
        }else{
            System.out.println("değil");
        }
        System.out.println(yeniKelime);





        /*for (int i=0;i< dizi.length;i++){
            for (int j=0; j<dizi[i].length;j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println(" ");
        }*/


    }
}
