package com.company;

import java.util.Scanner;

public class dizi {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String kelime ="program";
        int length =kelime.length(),flag=0, miss=0;
        boolean status =false,exist=false, found=false;
        char [] guess = new char [length];
        char letter;

        while (status==false){

        // take a latter from the user
            System.out.println("Enter a letter in hhe word");
        // write 0 or guessed letters
            for (int i=0; i<length;i++){
                if (guess[i]==kelime.charAt(i)){
                    System.out.println(i);
                }else{
                    System.out.println("*");
                }
            }
            System.out.println(" : ");


        }

    }
}
