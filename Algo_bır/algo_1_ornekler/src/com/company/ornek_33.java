package com.company;

import java.util.Scanner;

public class ornek_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" a sayisini giriniz:");
        int a=scan.nextInt();
        System.out.println(" b sayisini giriniz:");
        int b=scan.nextInt();
        if  (a>b){
            for (int i=b; i<a; i++){
                System.out.println(i);
            }
        }else if  (b>a){
            for (int i=a; i<b; i++){
                System.out.println(i);
            }
        }
    }
}
