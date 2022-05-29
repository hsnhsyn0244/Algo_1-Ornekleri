package com.company;

public class ornek_18 {
    public static void main(String[] args) {
        boolean varmı=false;
        int sayac=0;
        int aranacak=3;
        int ilk=1,son=1023,orta;
        while (ilk<son){
            orta=(ilk+son)/2;
            if (aranacak==orta){
                varmı=true;
                break;
            }else if (aranacak<orta){
                son=orta-1;
            }else{
                ilk=orta+1;
            }
            sayac++;

        }if (varmı==true){
            System.out.println("bulundu . "+sayac);
        }else{
            System.out.println("bulamadı ."+sayac);
        }
    }
}
