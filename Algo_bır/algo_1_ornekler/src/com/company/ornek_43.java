package com.company;

import java.util.Scanner;

public class ornek_43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        int enb=sayi1;
        if (sayi2>enb){
            enb=sayi2;
        }if (sayi3>enb){
            enb=sayi3;
        }
        System.out.println("girilen sayılardan en buyugu : "+enb);
    }
}
