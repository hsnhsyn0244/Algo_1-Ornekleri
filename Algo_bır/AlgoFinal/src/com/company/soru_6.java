package com.company;

import java.util.Scanner;

public class soru_6 {
    public static void main(String[] args) {

        int satir,bosluk,yildiz;
        satir=7;
        bosluk=satir/2;
        yildiz=1;

        for (int i=0; i<satir; i++){
            for (int j=0;j<bosluk; j++){
                System.out.print(" ");
            }
            for (int j=0; j<yildiz; j++){
                System.out.print("*");
            }
            if (i<satir/2){// baklava diliminin üst kısmı
                bosluk--;
                yildiz+=2;
            }
            else{// baklava diliminin alt kısmı
                bosluk++;
                yildiz-=2;
            }
            System.out.println("");
        }


    }
}
