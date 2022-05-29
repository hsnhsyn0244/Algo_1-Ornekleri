package com.company;

import java.util.Scanner;

public class ornek_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayiyi giriniz :");
        int sayi = scan.nextInt();

        if (sayi<100 && sayi>0){
            System.out.println("Geçerli");
        }else{
            System.out.println("Geçerli değil");
        }
    }
}
