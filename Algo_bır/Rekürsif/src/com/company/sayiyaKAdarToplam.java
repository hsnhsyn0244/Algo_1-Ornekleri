package com.company;

public class sayiyaKAdarToplam {

    public static int toplam(int x ){
    if (x==11) return 11;

    return x+toplam(x+1);

    }

    public static void main(String[] args) {
        System.out.println(toplam(0));
    }
}
