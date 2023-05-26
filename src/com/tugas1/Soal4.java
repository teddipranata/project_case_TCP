package com.tugas1;

import java.util.*;

public class Soal4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int i, j, n, f1, f2, f3;
        int[] fibo = new int[30];

        System.out.print("Masukkan Nilai N : ");
        n = inputUser.nextInt();
        f1 = f2 = 1;
        f3 = 0;

        for (i = 0 ; i < n ; i++){
            fibo[i] = f1;
            f1 = f2 + f3;
            f3 = f2;
            f2 = f1;
        }

        for (i = 0 ; i < n ; i++){
            for (j = 0 ; j < n ; j++){
                if(i == j){
                    System.out.print(fibo[i] + " ");
                }

                else if (i == n-j-1) {
                    System.out.print(fibo[j] + " ");
                }

                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
