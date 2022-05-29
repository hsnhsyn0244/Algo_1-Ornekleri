package com.company;

public class ornek_17 {
    public static void main(String[] args) {
        int carpım = 1;
        int toplam = 0;
        for (int k = 2; k <= 4; k++) {
            for (int j = 1; j <= 3; j++) {

                carpım *= (k * j) + 1;

            }
            toplam+=carpım;
        }
        System.out.println(toplam);
    }
}
