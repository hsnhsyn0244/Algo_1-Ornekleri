package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class diziAtama {
    public static void main(String[] args) {
       String kelimeler[][]=new String[2][3];
       Scanner scan = new Scanner (System.in);
       int rakamlar[]={0,1,2,3,4,5,6,7,8,9};
      for (int i=0; i< kelimeler.length;i++){
           for (int j=0; j< kelimeler[i].length;j++){
               System.out.println("kelimeleri giriniz : ");
               kelimeler[i][j]=scan.nextLine();
           }
       }
        for (int i=0; i< kelimeler.length;i++){
           for (int j=0; j<kelimeler[i].length;j++){
               if (rakamlar.equals(kelimeler[i][j])){

               }

           }
       }


    }
}
