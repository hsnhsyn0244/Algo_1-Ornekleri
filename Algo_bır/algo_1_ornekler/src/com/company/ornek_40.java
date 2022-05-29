package com.company;

import java.util.Scanner;

public class ornek_40 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        for (int i=1; i<11; i++){
            System.out.println(i+". sayiyi giriniz");
            int sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi : "+sayi);
            }else if(sayi==0){
                System.out.println("sayi sifridir : "+sayi);
            }else{
                System.out.println("sayi pozitifitr : "+sayi);
            }
        }
    }
}
