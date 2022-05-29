package com.company;

import java.util.Scanner;

public class ornek_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi =scan.nextInt();
        if (sayi%3==0 && sayi%5==0){
            System.out.println("Tam bölünüyor");
        }else{
            System.out.println("Tam bölünmüyor");
        }

    }
}
