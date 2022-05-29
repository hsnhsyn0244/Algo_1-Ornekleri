package com.company;

import java.util.Scanner;

public class ornek_56 {
    public static void main(String[] args) {

        int carpım=1;
        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();;
        if (sayi<=25 && sayi>0){
            for (int i= 1;i<=sayi; i++ ){
                carpım=carpım*i;
            }
            System.out.println(sayi + "! = "+carpım);
        }else{
            System.out.println("istenilen aralıkta degildir . ");
        }

    }
}
