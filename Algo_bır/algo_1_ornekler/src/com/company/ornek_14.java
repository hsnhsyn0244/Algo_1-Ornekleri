package com.company;

import java.util.Scanner;

public class ornek_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Akımın şiddetini giriniz :");
        double I = scan.nextDouble();
        System.out.println("direnc in buyuklugunu giriniz :");
        double R = scan.nextDouble();

        double V = I * R;
        System.out.println("Var olan gerilim : " + V);
    }
}
