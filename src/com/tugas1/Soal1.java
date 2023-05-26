package com.tugas1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int i,j, ukuran;
        System.out.println("============================");
        System.out.println("========== Case 1 ==========");
        System.out.println("== Persegi dengan Bintang ==");
        System.out.println("============================");
        System.out.print("Masukkan Ukuran : ");
        ukuran = inputUser.nextInt();
        System.out.println("============================");
        for(i = 0 ; i < ukuran ; i++){
            for(j = 0 ; j < ukuran ; j++){
                System.out.print("*  ");
            }
            System.out.println("  ");
        }
        System.out.println("============================");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("============================");
        System.out.println("========== Case 2 ==========");
        System.out.println("===== X dengan Bintang =====");
        System.out.println("============================");
        System.out.print("Masukkan Ukuran : ");
        ukuran = inputUser.nextInt();
        System.out.println("============================");
        for(i = 0 ; i < ukuran ; i++){
            for(j = 0 ; j < ukuran ; j++){
                if (i == j | i == ukuran-j-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        System.out.println("============================");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("============================");
        System.out.println("========== Case 3 ==========");
        System.out.println("=== Persegi dengan Angka ===");
        System.out.println("============================");
        System.out.print("Masukkan Ukuran : ");
        ukuran = inputUser.nextInt();
        System.out.println("============================");
        for(i = 0 ; i < ukuran ; i++){
            for(j = 0 ; j < ukuran ; j++){
                System.out.print(j + " ");
            }
            System.out.println("  ");
        }
        System.out.println("============================");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("============================");
        System.out.println("========== Case 4 ==========");
        System.out.println("====== X dengan Angka ======");
        System.out.println("============================");
        System.out.print("Masukkan Ukuran : ");
        ukuran = inputUser.nextInt();
        System.out.println("============================");
        for(i = 0 ; i < ukuran ; i++){
            for(j = 0 ; j < ukuran ; j++){
                if (i == j){
                    System.out.print((i*2+1) + " ");
                }

                else if (i == ukuran-j-1) {
                    System.out.print((j*2+1) + " ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        System.out.println("==========================");
    }
}
