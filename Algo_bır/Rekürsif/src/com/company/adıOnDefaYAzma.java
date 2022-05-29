package com.company;

public class adıOnDefaYAzma {

    public static void yaz(int n) {
        if (n >= 1) {
            System.out.println("Hasan");
            yaz(--n);
        }
    }

    public static void main(String[] args) {
        yaz(10);
    }

}
