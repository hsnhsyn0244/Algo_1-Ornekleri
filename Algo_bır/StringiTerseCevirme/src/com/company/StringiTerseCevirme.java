package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringiTerseCevirme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mesaj= scan.nextLine();

        for (int i=mesaj.length()-1; i>=0; i--){
            System.out.print(mesaj.charAt(i));
        }
    }
}
