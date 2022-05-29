package com.company;

import java.util.Scanner;

public class Asal {

    public static int asalMi(int sayi, int i) {
        if (i == 1)
            return 1;
        else if (sayi % i == 0) {
            return 0;
        } else {
            return asalMi(sayi, i - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi gir");
        int sayi= scan.nextInt();
        int asal=asalMi(sayi,sayi/2);
        if (asal==1){
            System.out.println("asaldir");
        }else{
            System.out.println("Asal değildir.");
        }
    }
}
