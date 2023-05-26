package com.tugas1;

import java.util.*;

public class Soal3 {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int i, n, f1, f2, f3, f4;
        System.out.printf("Deret Tribonacci");
        f1 = f2 = 1;
        f3 = f4 = 0;
        System.out.print("Masukkan Nilai N : ");
        n= inputUser.nextInt();

        for (i = 1 ; i <= n ; i++){
            System.out.print(f1 + " ");
            f1 = f2+f3+f4;
            f4 = f3;
            f3 = f2;
            f2 = f1;
        }
    }
}
