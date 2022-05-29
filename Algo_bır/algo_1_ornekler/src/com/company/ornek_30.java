package com.company;

import java.util.Scanner;

public class ornek_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A sayısı girniz : ");
        int a = scan.nextInt();
        System.out.println("B sayısı girniz : ");
        int b = scan.nextInt();

        int c=a-b;
        System.out.println(c);
    }
}
