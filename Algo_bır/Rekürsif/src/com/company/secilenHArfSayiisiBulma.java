package com.company;

public class secilenHArfSayiisiBulma {

    public static int kacTane(String string, int n) {
        if (n > string.length() - 1) {
            return 0;
        } else if (string.charAt(n) == 'a') {
            return 1 + kacTane(string, n + 1);
        } else {
            return kacTane(string, n + 1);
        }
    }

    public static void main(String[] args) {
        int x=kacTane("buradayım",0);
        System.out.println(x);
    }
}
