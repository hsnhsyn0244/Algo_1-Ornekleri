package com.company;

import java.util.Scanner;

public class baklavaDilimi {
    public static void main(String[] args) {
        int i, j;

        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz ");
        int satir = scan.nextInt();
        int bosluk = satir / 2;
        int yildiz=1;

        for (i = 0; i < satir; i++) {
            for (j = 0; j<bosluk; j++ ){
                System.out.print(" ");
            }for (j=0;j<yildiz;j++){
                System.out.print("*");
            }
            if (i<satir/2){
                bosluk--;
                yildiz+=2;
            }else{
                bosluk++;
                yildiz-=2;
            }
            System.out.println("");

        }
    }
}
