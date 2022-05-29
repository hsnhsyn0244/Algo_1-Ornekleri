package com.company;

public class faktoriyel {

    public static int fak(int x){
        if (x==5){
            return 5;
        }
        System.out.println("x : "+x);
        return x*fak(x+1);
    }

    public static int fak2(int n){
        if (n==1) return 1;
        return n*fak(n-1);
    }


    public static void main(String[] args) {
        System.out.println(fak(1));
        System.out.println("------------");
        System.out.println(fak2(5));
    }
}
