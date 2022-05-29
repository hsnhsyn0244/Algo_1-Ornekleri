package com.company;

import java.util.Scanner;

public class ornek_31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("N sayisini giriniz : ");
        int N = scan.nextInt();
        int toplam = 0;
        int sonuc =1;

        int toplam2 = 0;
        int sonuc2=0;
        for (int i = 1; i <= N; i++) {
            if (i%2==1){
                toplam+=i;
                sonuc*=i;
            }else{
                sonuc2=i*i;
                toplam2+=sonuc2;
            }
        }
        System.out.println("toplam : "+toplam+"/ carpım : "+sonuc);
        System.out.println(toplam2);
    }
}
