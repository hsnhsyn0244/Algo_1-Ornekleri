package com.company;

public class meryemOdev {
    public static void main(String[] args) {
        for (int i=0; i<1000;i++){

            if (i%3==2 && i%4==3 && i%5==4){
                System.out.println(i);

            }

        }int toplam=59+119+179+239+299+359;

        System.out.println("sonuc : "+toplam%8);
    }

}
