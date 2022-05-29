package com.company;

import javax.sound.midi.MidiFileFormat;
import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {

        int sayac;
        for (int i =2; i<=100; i++){
            sayac=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    sayac++;
                }
            }
            if (sayac == 2 ){
                System.out.println("Sayı asaldır : " + i);
            }else {
                System.out.println("Sayi asal değildir : " + i);
            }
        }

    }
}
