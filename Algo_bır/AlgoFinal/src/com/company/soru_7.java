package com.company;

public class soru_7 {
    public static void main(String[] args) {
        double toplam=0;
        double carpim =1;
        for (int i=1; i<4 ; i++ ){
            carpim=1;
            for (int j=1; j<5 ; j++ ){
                int x=0;
                int y=0;
                int us=1;
                int fak=1;
                for (int k=1;k<j+1;k++){
                    fak=fak*k;
                    x=fak;
                }
                for (int l=1;l<i+1;l++){
                    us=us*j;
                    y=us;
                }

                carpim=carpim*((y/x)+5);
                System.out.println("us alma : "+y);
                System.out.println("faktorıyel : "+x);
                System.out.println("for 2 : "+carpim);

            }
            toplam=toplam+carpim;
            System.out.println("for 1 : "+toplam);
        }
        System.out.println("------");
        System.out.println(toplam);
    }
}
