package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(faktoriyel(5));
        System.out.println(usAlma(4,5));
    }

    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        while (sayi > 0) {
            sonuc *= sayi;
            sayi--;
        }
        return sonuc;
    }
    public static int usAlma(int taban,int us){
        int sonuc=1;
        while(us>0){
            sonuc*=taban;
            us--;
        }
        return sonuc;
    }
}
