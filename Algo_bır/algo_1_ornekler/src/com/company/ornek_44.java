package com.company;

public class ornek_44 {
    public static void main(String[] args) {
        double toplam=0;

        int sayac=0;

        for (int i=7 ; i<25; i++){
            if (i%2==1){
                System.out.println(i);
                toplam+=i;
                sayac++;
                System.out.println(sayac);
            }
        }
        System.out.println(toplam/sayac);
    }
}
