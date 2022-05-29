package com.company;

public class ornek_16 {
    public static void main(String[] args) {
        // (k+j+3)

        int toplam2=0;
        for (int k=3;k<=6;k++){
            int toplam1=0;
            for (int j=2;j<=5;j++){

                toplam1+=k+j+3;

            }
            toplam2+=toplam1;
        }
        System.out.println(toplam2);
    }
}
