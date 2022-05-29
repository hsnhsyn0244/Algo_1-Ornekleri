package com.company;

public class Soru_3 {
    public static void main(String[] args) {
        int toplam=0;
        int toplam2 = 0;
        int carpim=1;

        for (int i = 1; i < 3; i++) {
            carpim = 1;
            for (int j = 1; j < 4; j++) {
                toplam=0;
                for (int k = 1; k < 5; k++) {
                    toplam += (i + j + k);
                    System.out.println("for 3 : "+toplam);
                }

                carpim *= toplam;
                System.out.println("for 2 : " +carpim);
            }

            toplam2 += carpim;
            System.out.println("for 1 : "+toplam2);
        }
        System.out.println(toplam2);
    }

}
