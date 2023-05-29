package com.tugas2;

import java.util.*;

public class LeftPadding {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Masukkan Input String : ");
        String Kata = userInput.next();
        System.out.printf("Masukkan Nilai n      : ");
        int n = userInput.nextInt();
        StringBuilder builder = new StringBuilder();


        if(n > builder.length()){
            for (int i=0 ; i<(n-Kata.length()) ; i++){
                builder.append("_");
            }
            builder.append(Kata);
            System.out.println("String Baru : |" + builder + "|");
            System.out.println("Panjang     : " + builder.length());
        }
        else {
            System.out.println("String Baru : |" + Kata);
        }
    }
}
